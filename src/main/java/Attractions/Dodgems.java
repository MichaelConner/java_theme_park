package Attractions;

public class Dodgems extends Attractions {

    private int noOfCars;

    public Dodgems(String name, int noOfCars) {
        super(name);
        this.noOfCars = noOfCars;
    }

    public int getNoOfCars() {
        return noOfCars;
    }

    public void setNoOfCars(int noOfCars) {
        this.noOfCars = noOfCars;
    }

}
