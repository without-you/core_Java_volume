package demo05.arrayList;

import demo05.equals.Employee;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author 烂醉花间
 * @date 2023/3/4  15:46
 */
public class ArrayListTest {
    public static void main(String[] args) {
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl Cracker", 7500.0, LocalDate.of(1987, 12, 15)));
        staff.add(new Employee("Harry Hacker", 5000.0, LocalDate.of(1987, 12, 15)));
        staff.add(new Employee("Tony Tester", 4000.0, LocalDate.of(1987, 12, 15)));

        for (Employee e : staff) {
            e.raiseSalary(5.0);
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",localDate="+e.getLocalDate());
        }
    }
}
