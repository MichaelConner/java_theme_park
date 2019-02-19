package Stall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smoke To See You", "Michael Conner", 1, 5);
    }


    @Test
    public void hasName() {
        assertEquals("Smoke To See You", tobaccoStall.getName());
    }

    @Test
    public void canChangeName() {
        tobaccoStall.setName("Gilroy's Family Friendly Cigarettes");
        assertEquals("Gilroy's Family Friendly Cigarettes", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Michael Conner", tobaccoStall.getOwnerName());
    }

    @Test
    public void canChangeOwner() {
        tobaccoStall.setOwnerName("Gilroy Monsanto");
        assertEquals("Gilroy Monsanto", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        tobaccoStall.setParkingSpot(2);
        assertEquals(2, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasBrands() {
        assertEquals(5, tobaccoStall.getNoOfBrands());
    }

    @Test
    public void canChangeNoOfBrands() {
        tobaccoStall.setNoOfBrands(3);
        assertEquals(3, tobaccoStall.getNoOfBrands());
    }

}
