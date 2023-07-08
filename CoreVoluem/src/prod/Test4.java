package prod;

import firstVolume.demo04.Employee;

/**
 * @author 烂醉花间
 * @date 2023/2/23  20:10
 */
public class Test4 {
    public static void main(String[] args) {
        Employee a = new Employee("Alice", 100);
        Employee b = new Employee("Bob", 200);
        swap(a, b);
        System.out.println(a.getName());
        System.out.println(b.getName());

    }

    static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
