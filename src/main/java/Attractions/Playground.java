package Attractions;

import ISecurity;
import Visitor;

public class Playground extends Attractions implements ISecurity{

    private int noOfFirstAiders;

    public Playground(String name, int noOfFirstAiders) {
        super(name);
        this.noOfFirstAiders = noOfFirstAiders;
    }

    public int getNoOfFirstAiders() {
        return noOfFirstAiders;
    }

    public void setNoOfFirstAiders(int noOfFirstAiders) {
        this.noOfFirstAiders = noOfFirstAiders;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() < 16;
    }


}