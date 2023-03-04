package demo05.inheritance;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/2/28  19:51
 */
public class Manager extends Employee{
    private Double bonus;

    public Manager(String name, Double salary, LocalDate localDate) {
        super(name,salary,localDate);
        bonus = 0.0;
    }

    public Double getSalary(){
        return super.getSalary()+bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
