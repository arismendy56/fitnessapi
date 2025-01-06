package al.powerlifting.fitnessapi.model;

public abstract class Maxes {

    private int squatMax;
    private int benchMax;
    private int deadliftMax;
    private int maxTotal;

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getDeadliftMax() {
        return deadliftMax;
    }

    public void setDeadliftMax(int deadliftMax) {
        this.deadliftMax = deadliftMax;
    }

    public int getBenchMax() {
        return benchMax;
    }

    public void setBenchMax(int benchMax) {
        this.benchMax = benchMax;
    }

    public int getSquatMax() {
        return squatMax;
    }

    public void setSquatMax(int squatMax) {
        this.squatMax = squatMax;
    }
}
