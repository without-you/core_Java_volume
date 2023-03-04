package demo05.abstractClasses;

/**
 * @author 烂醉花间
 * @date 2023/2/28  20:15
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 获取一个描述
     *
     * @return 返回描述
     */
    public abstract String getDescription();

}
