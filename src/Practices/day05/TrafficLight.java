package Practices.day05;

import day02.SringPractice3;

public class TrafficLight {

    private String color;

    public TrafficLight (String color){
        setColor (color);
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        switch (color.toLowerCase()) {
            case "red":
            case"yellow":
            case "grey":
                this.color = color;
        }
    }
}
