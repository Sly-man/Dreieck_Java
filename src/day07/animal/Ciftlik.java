package day07.animal;

public class Ciftlik {

    public static void main(String[] args) {

        //polymorhpisim
        //1.parent reference
        Animal at1 = new At();
        at1.eat();
        at1.sleep();

        //2.itself reference
        At at2 = new At();
        at2.eat();
        at2.sleep();
        at2.running();


        //////


        System.out.println("=============");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();








    }
}