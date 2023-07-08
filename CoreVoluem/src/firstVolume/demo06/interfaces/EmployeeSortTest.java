package firstVolume.demo06.interfaces;

import java.util.Arrays;

/**
 * @author 烂醉花间
 * @date 2023/3/19  15:54
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 3500);
        staff[1] = new Employee("Carl Cracker", 7500);
        staff[2] = new Employee("Tony Tester", 3800);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name:"+e.getName()+",salary:"+e.getSalary());
        }
    }
}
