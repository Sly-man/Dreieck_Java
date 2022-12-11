package Practices.day04;

import java.util.ArrayList;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Google", "Texas", 200_000, true, 15);
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
        System.out.println(allOffers);
        System.out.println("=====");
        allOffers.add(new Offer("Amazon", "New York", 180_000, true, 15));
        System.out.println(allOffers);
    }



}
