package firstVolume.demo05.inheritance;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/2/28  19:47
 */
public class Employee {
    private String name;
    private Double salary;
    private LocalDate localDate;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Double salary, LocalDate localDate) {
        this.name = name;
        this.salary = salary;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", localDate=" + localDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void raiseSalary(Double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
