package demo04;

/**
 * @author 烂醉花间
 * @date 2023/2/23  20:14
 */
public class ParamTest {
    public static void main(String[] args) {
        /*Test1*/
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);
        /*Test2*/
        System.out.println("\nTesting  tripleSalary:");
        var harry = new Employee("Harry", 5000);
        System.out.println("Before Harry salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After Harry salary="+harry.getSalary());
        /*Test3*/
        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice", 3000);
        Employee b = new Employee("Bob", 4000);
        System.out.println("Before a="+a.getName());
        System.out.println("Before b="+b.getName());
        swap(a, b);
        System.out.println("Before a="+a.getName());
        System.out.println("Before b="+b.getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = x;
        System.out.println("End of method x="+x.getName());
        System.out.println("End of method y="+y.getName());
    }

    private static void tripleSalary(Employee employee) {
        employee.raiseSalary(200);
        System.out.println("End of method: salary="+employee.getSalary());
    }

    private static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method: x="+x);
    }
}
