package al.powerlifting.fitnessapi.model;

public class Exercise {

    private String exerciseName;
    private int sets;
    private int reps;
    private int load;
    private double rpe;
    private double lastSetRpe;
    private int lowRange;
    private int highRange;
    private int ERM;
    private int lwChange;
    private String notes;


    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public double getRpe() {
        return rpe;
    }

    public void setRpe(double rpe) {
        this.rpe = rpe;
    }

    public double getLastSetRpe() {
        return lastSetRpe;
    }

    public void setLastSetRpe(double lastSetRpe) {
        this.lastSetRpe = lastSetRpe;
    }

    public int getLowRange() {
        return lowRange;
    }

    public void setLowRange(int lowRange) {
        this.lowRange = lowRange;
    }

    public int getHighRange() {
        return highRange;
    }

    public void setHighRange(int highRange) {
        this.highRange = highRange;
    }

    public int getERM() {
        return ERM;
    }

    public void setERM(int ERM) {
        this.ERM = ERM;
    }

    public int getLwChange() {
        return lwChange;
    }

    public void setLwChange(int lwChange) {
        this.lwChange = lwChange;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
