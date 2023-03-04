package demo04;

/**
 * @author 烂醉花间
 * @date 2023/2/28  19:09
 */
public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 6000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for (Employee employee : staff) {
            System.out.println("Employee Name:"+employee.getName()+",id="+employee.getId()+",salary="+employee.getSalary());
        }
    }
}
