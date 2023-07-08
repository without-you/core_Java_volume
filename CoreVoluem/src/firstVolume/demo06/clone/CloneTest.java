package firstVolume.demo06.clone;

/**
 * @author 烂醉花间
 * @date 2023/3/19  17:00
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original="+original);
        System.out.println("copy="+copy);
    }
}
