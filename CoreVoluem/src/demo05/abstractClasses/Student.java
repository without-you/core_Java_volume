package demo05.abstractClasses;

/**
 * @author 烂醉花间
 * @date 2023/2/28  20:17
 */
public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getDescription() {
        return String.format("a student majoring in"+major);
    }
}
