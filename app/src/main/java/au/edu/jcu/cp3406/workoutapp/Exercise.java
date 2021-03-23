package au.edu.jcu.cp3406.workoutapp;

public class Exercise {

    private String name;    //name of exercise
    private int time;       //time to complete 1 rep of exercise in milliseconds

    Exercise (String exerciseName, int timeTaken){
        name = exerciseName;
        time = timeTaken;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
}
