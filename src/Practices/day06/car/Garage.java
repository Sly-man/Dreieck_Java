package Practices.day06.car;

public class Garage {
    public static void main(String[] args) {
        //        Car obj1 = new Car();  Car is abstract, so we cannot make an object of this class

        Toyota car2 = new Toyota();
        car2.start();

        System.out.println();

        Honda car3 = new Honda();
        car3.start();
        // Both Toyota and Honda were concrete classes, because they were not abstract, so we had to implement the start method

        // ElectricCar obj4 = new ElectricCar(); ElectricCar is abstract, so we cannot create an object of this class

        System.out.println();

        Tesla car4 = new Tesla();
        car4.charge();
        car4.start();




    }
}
