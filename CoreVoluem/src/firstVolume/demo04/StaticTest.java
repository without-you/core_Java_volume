package firstVolume.demo04;

/**
 * @author 烂醉花间
 * @date 2023/2/20  19:50
 */
public class StaticTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 4000);
        staff[1] = new Employee("Dick", 6000);
        staff[2] = new Employee("Harry", 6500);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId());
        }
        System.out.println("Next available id="+Employee.getNextId());
    }
}
