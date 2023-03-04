package demo05.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 烂醉花间
 * @date 2023/3/4  14:54
 */
public class Manager extends Employee {
    private Double bonus;

    public Manager(String name, Double salary, LocalDate localDate) {
        super(name, salary, localDate);
        this.bonus = 0.0;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        var other = (Manager) obj;
        return Objects.equals(bonus, other.bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
