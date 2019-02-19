package Stall;

public class CandyFlossStall extends Stall {

    private int noOfFlavours;

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int noOfFlavours) {
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