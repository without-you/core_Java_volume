package demo04;

import java.time.LocalDate;
import java.util.Random;

/**
 * @author 烂醉花间
 * @date 2023/2/18  19:14
 */
public class Employee {
    //实例属性

    private String name = "";
    private double salary;
    private LocalDate hireDay;
    private int id;
    private static int nextId;

    static {
        var generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }
    //constructor

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Emplpyee #" + nextId, salary);
    }

    public Employee() {
    }

    //a method

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public static int getNextId(){
        return nextId;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        //创建员工类的数组
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 7500, LocalDate.of(1987,12,15));
        staff[1] = new Employee("Harry Hacker", 5000, LocalDate.of(1989,10,1));
        staff[2] = new Employee("Tony Tester", 4000, LocalDate.of(1990,3,15));

        Employee harry = new Employee("Carl Cracker", 7500, LocalDate.of(1987,12,15));
        //提升每个员工5%的工资
        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        //打印出每个员工的信息

        for (Employee employee : staff) {
            System.out.println("name:"+employee.getName()+",salary:"+employee.getSalary()+",hireDay"+employee.getHireDay());
        }
    }
}