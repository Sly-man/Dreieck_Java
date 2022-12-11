package Practices.day04;

public class UseCarpet {

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(2.5, 4, true, 35);

        System.out.println("carpet1 = " + carpet1);
        carpet1.length = 14;
        carpet1.calculatePrice();
        System.out.println(carpet1.totalPrice);
    }

    }



