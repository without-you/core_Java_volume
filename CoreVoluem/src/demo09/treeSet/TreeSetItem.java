package demo09.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 烂醉花间
 * @date 2023/4/2  20:37
 */
public class TreeSetItem {
    public static void main(String[] args) {
        Set<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        parts.add(new Item("Han", 9805));
        System.out.println(parts);

        Set<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
