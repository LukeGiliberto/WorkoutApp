package au.edu.jcu.cp3406.workoutapp;

import java.util.List;

public class Workout {

    private int restTime;               //time between exercise sets (rest period)
    private List<Exercise> workout;     //name of workout
    private List<Integer> reps;         //number of reps of workout

    Workout(){
        restTime = 30000;   //30 seconds by default
    }
    /**
     * adds an exercise along with the number of reps to the workout routine
     * @param exercise
     * @param numOfReps
     */
    public void addExercise(Exercise exercise, int numOfReps){
        workout.add(exercise);
        reps.add(numOfReps);
    }

    public Exercise getExercise(int i){
        return workout.get(i);
    }

    public int getReps(int i){
        return reps.get(i);
    }

    /**
     * Returns the total time taken in milliseconds to complete the workout:
     * each workout * number of reps + rest periods between each set
     * @return
     */
    public int totalTime(){
        int timeTaken = 0;
        timeTaken += workout.size()*restTime;
        for (int i = 0; i < workout.size(); i++){
            timeTaken += (workout.get(i).getTime()*reps.get(i));
        }
        return (timeTaken);
    }

}
