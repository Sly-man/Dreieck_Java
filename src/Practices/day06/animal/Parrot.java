package Practices.day06.animal;

import day06.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye bye");
    }
}
