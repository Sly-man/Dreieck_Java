package Practices.day05;

public class Road {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("grey");
//       System.out.println(light.color);
        //private oldugundan ulasamayiz.
//
//      light.color = "pink"; //private, not visible

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColor());

        light2.setColor("grey"); //Assign edilebilir. Lakin limitation var setColor icinde.
        //Bundan dolayi color --> asil deger (red) olarak kalir.

        System.out.println(light2.getColor());

        TrafficLight light3 = new TrafficLight("Black");
        //setColor limitation icinde black olmadigindan herhangi
        //bir deger atanamadi. defualt null olur.
        System.out.println(light3.getColor());

    }


}

