package Stall;

import Visitor.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

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

    @Override
    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() >= 18;
    }

}