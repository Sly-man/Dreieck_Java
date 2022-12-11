package day05.b;

import day05.a.First;

public class Third extends First {
    public static void main(String[] args) {
        First f1 = new First();
        //f1.a; default, sadece ayni package icinde kullanilabilir
        System.out.println("f1.d = " + f1.d);

        Third t3 = new Third(); //child class
        System.out.println("t3.c = " + t3.c);


    }

}