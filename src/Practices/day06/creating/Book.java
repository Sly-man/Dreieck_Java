package Practices.day06.creating;

public class Book implements Create{

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
