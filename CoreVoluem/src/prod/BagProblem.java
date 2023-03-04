package prod;

import java.util.ArrayList;
import java.util.List;

public class BagProblem {
    public static void main(String[] args) {
        Co co1 = new Co(2, 1.0, "co1");
        Co co2 = new Co(3, 3.0, "co2");
        Co co3 = new Co(4, 4.0, "co3");
        Double maxWeight = 4.0;
        List<Co> coList = new ArrayList<>();
        coList.add(co1);
        coList.add(co2);
        coList.add(co3);
        getMaxMoney(coList, maxWeight);
    }

    private static void getMaxMoney(List<Co> coList, Double maxWeight) {
        int count = 0;
        List<Co> resultList = new ArrayList<>();
        //  1 中最大
    }
}

class Co {
    private Integer price;
    private Double weight;
    private String name;

    public Co(Integer price, Double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
