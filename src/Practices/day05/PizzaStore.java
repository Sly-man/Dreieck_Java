package Practices.day05;

import Practices.Pizza;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza first = new Pizza("large", 3);

        System.out.println(first);

        first.setNumberOfToppings(2);
        System.out.println(first);
    }
}
