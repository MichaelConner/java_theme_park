package Stall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ice To See You", "Michael Conner", 1, 100000000);
    }


    @Test
    public void hasName() {
        assertEquals("Ice To See You", iceCreamStall.getName());
    }

    @Test
    public void canChangeName() {
        iceCreamStall.setName("Gilroy's Family Friendly Ices");
        assertEquals("Gilroy's Family Friendly Ices", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Michael Conner", iceCreamStall.getOwnerName());
    }

    @Test
    public void canChangeOwner() {
        iceCreamStall.setOwnerName("Gilroy Monsanto");
        assertEquals("Gilroy Monsanto", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        iceCreamStall.setParkingSpot(2);
        assertEquals(2, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasFlavour() {
        assertEquals(100000000, iceCreamStall.getNoOfFlavours());
    }

    @Test
    public void canChangeNoOfFlavours() {
        iceCreamStall.setNoOfFlavours(100000001);
        assertEquals(100000001, iceCreamStall.getNoOfFlavours());
    }


}