package Stall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Floss To See You", "Michael Conner", 1, 2);
    }


    @Test
    public void hasName() {
        assertEquals("Floss To See You", candyFlossStall.getName());
    }

    @Test
    public void canChangeName() {
        candyFlossStall.setName("Gilroy's Family Friendly Flosses");
        assertEquals("Gilroy's Family Friendly Flosses", candyFlossStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Michael Conner", candyFlossStall.getOwnerName());
    }

    @Test
    public void canChangeOwner() {
        candyFlossStall.setOwnerName("Gilroy Monsanto");
        assertEquals("Gilroy Monsanto", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canChangeParkingSpot() {
        candyFlossStall.setParkingSpot(2);
        assertEquals(2, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasFlavour() {
        assertEquals(2, candyFlossStall.getNoOfFlavours());
    }

    @Test
    public void canChangeNoOfFlavours() {
        candyFlossStall.setNoOfFlavours(3);
        assertEquals(3, candyFlossStall.getNoOfFlavours());
    }

}