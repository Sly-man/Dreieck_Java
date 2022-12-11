package Practices.day06.exercise;

public abstract class Exercise {

    final String name;
    public Exercise(String name){
        this.name = name;
    }
    public abstract void performExercise ();
    public abstract int getCaloriesBurned (int minutes);
}
