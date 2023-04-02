package demo08.pair3;

import demo05.inheritance.Employee;
import demo05.inheritance.Manager;
import demo08.Pair;

import java.time.LocalDate;

/**
 * @author 烂醉花间
 * @date 2023/3/27  21:51
 */
public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("Gus Greedy", 80000.0, LocalDate.of(2003, 12, 15));
        Manager cfo = new Manager("Sid Sneaky", 60000.0, LocalDate.of(2003, 12, 15));
        Pair<Manager> buddies = new Pair<>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(100000000.0);
        cfo.setBonus(5000000.0);
        Manager[] managers = {ceo, cfo};

        Pair<Employee> result = new Pair<>();
        minMaxBonus(managers,result);
        System.out.println("first: "+result.getFirst().getName()+",second"+result.getSecond().getName());
        maxMinBonus(managers,result);
        System.out.println("first: "+result.getFirst().getName()+",second"+result.getSecond().getName());
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + "are buddies");
    }

    public static void minMaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxMinBonus(Manager[] a, Pair<? super Manager> result) {
        minMaxBonus(a, result);
        PairAlg.swap(result);
    }
}

class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> pair) {
        swapHelper(pair);
    }
    /**
     * 通配符捕获
     */
    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
