package firstVolume.demo05.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 烂醉花间
 * @date 2023/3/4  14:48
 */
public class Employee {
    private String name;
    private Double salary;
    private LocalDate localDate;

    public Employee(String name, Double salary, LocalDate localDate) {
        this.name = name;
        this.salary = salary;
        this.localDate = localDate;
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
        Double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        var other = (Employee) obj;
        return Objects.equals(name, other.name) && Objects.equals(salary, other.salary) && Objects.equals(localDate, other.localDate);
    }
}
