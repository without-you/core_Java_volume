package demo05.abstractClasses;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/2/28  20:14
 */
public class Employee extends Person {
    private Double salary;
    private LocalDate hireDay;

    public Employee(String name, Double salary, LocalDate hireDay) {

        super(name);
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(Double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
