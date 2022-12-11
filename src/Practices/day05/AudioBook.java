package Practices.day05;

public class AudioBook extends Book{

    int duration;
    String narrator;

    public void listen () {
        System.out.println("Listening to "
                + title + " narrated by " + narrator);
    }

// AudioBook is a Book

/*
Create a class AudioBook
    - AudioBook class inherits Book class
    - create additional variables:
        duration, narrator
    - create method:
        listen()
            Example output: prints listening to $title narrated by $narrator
 */

}
