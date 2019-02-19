package Attractions;

import Attractions.Attractions;

public class Rollercoaster extends Attractions {

    private int maxSpeed;

    public Rollercoaster(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
