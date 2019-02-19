package Stall;

public class IceCreamStall extends Stall {

    private int noOfFlavours;

    public IceCreamStall(String name, String ownerName, int parkingSpot, int noOfFlavours) {
        super(name, ownerName, parkingSpot);
        this.noOfFlavours = noOfFlavours;
    }

    public int getNoOfFlavours() {
        return noOfFlavours;
    }

    public void setNoOfFlavours(int noOfFlavours) {
        this.noOfFlavours = noOfFlavours;
    }

}