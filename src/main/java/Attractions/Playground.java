package Attractions;

public class Playground extends Attractions {

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
}