package firstVolume.demo05.equals;

import firstVolume.demo04.Employee;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/3/4  14:59
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice Adams", 7500.0, LocalDate.of(1987, 12, 15));
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 7500.0, LocalDate.of(1987, 12, 15));
        var bob = new Employee("Bob Brandson", 5000.0, LocalDate.of(1989, 10, 1));
        System.out.println("alice1 == alice2:" + (alice1 == alice2));
        System.out.println("alice1 == alice3:" + (alice1 == alice3));
        System.out.println("alice1.equals(alice3):" + (alice1.equals(alice3)));
        System.out.println("alice1.equals(bob):" + (alice1.equals(bob)));
        System.out.println("bob.toString():" + bob);

        var carl = new Manager("Carl Cracker", 8000.0, LocalDate.of(1987, 12, 15));
        var boss = new Manager("Carl Cracker", 8000.0, LocalDate.of(1987, 12, 15));
        boss.setBonus(5000.0);
        System.out.println("boss.toString():" + boss);
        System.out.println("carl.equals(boss):" + (carl.equals(boss)));
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("carl.hashCode():" + carl.hashCode());

    }
}
