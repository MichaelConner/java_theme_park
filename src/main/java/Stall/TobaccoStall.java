package Stall;

public class TobaccoStall extends Stall {

    private int noOfBrands;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int noOfBrands) {
        super(name, ownerName, parkingSpot);
        this.noOfBrands = noOfBrands;
    }

    public int getNoOfBrands() {
        return noOfBrands;
    }

    public void setNoOfBrands(int noOfBrands) {
        this.noOfBrands = noOfBrands;
    }

}