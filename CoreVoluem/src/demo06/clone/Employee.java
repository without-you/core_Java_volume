package demo06.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 烂醉花间
 *   mn0 0
 *   e@date 2023/3/19  16:32
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employ[name]=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
