package firstVolume.demo05.abstractClasses;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/2/28  20:22
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        people[0] = new Employee("Harry Hacker", 5000.0, LocalDate.of(1989, 10, 1));
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people) {
            System.out.println("People Name="+p.getName()+",description="+p.getDescription());
        }
    }
}
