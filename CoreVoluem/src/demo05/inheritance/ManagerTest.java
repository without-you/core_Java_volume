package demo05.inheritance;


import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/2/28  19:50
 */
public class ManagerTest{
    public static void main(String[] args) {
        var boss = new Manager("Carl Cracker", 80000.0, LocalDate.of(1987,12,15));
        boss.setBonus(5000.0);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5000.0, LocalDate.of(1989,10,1));
        staff[2] = new Employee("Tony Tester", 4000.0, LocalDate.of(1990,3,15));

        for (Employee e : staff) {
            System.out.println("Employee Name="+e.getName()+",salary="+e.getSalary()+",localDate="+e.getLocalDate());
        }
    }
}
