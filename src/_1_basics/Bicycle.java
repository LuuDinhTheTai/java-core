package _1_basics;

public class Bicycle {

    private static int numGear = 6;
    private int currentSpeed;

    public void run(int speed) { // <- parameter
        boolean b = false; // <- local variable
        currentSpeed = speed;
    }

    public int getNumGear() {
        return numGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void  setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
