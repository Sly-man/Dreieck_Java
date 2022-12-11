package day06.animal;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}