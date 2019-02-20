package Attractions;

import Visitor.ISecurity;
import Visitor.Visitor;

public class Rollercoaster extends Attractions implements ISecurity{

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

    @Override
    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() > 12 && visitor.getHeight() > 1.45);
    }

}
