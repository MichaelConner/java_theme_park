package Attractions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Stargazing", 12);
    }


    @Test
    public void hasName() {
        assertEquals("Stargazing", dodgems.getName());
    }

    @Test
    public void canChangeName() {
        dodgems.setName("Astrothunder");
        assertEquals("Astrothunder", dodgems.getName());
    }

    @Test
    public void hasCars() {
        assertEquals(12, dodgems.getNoOfCars());
    }

    @Test
    public void canChangeNoOfCars() {
        dodgems.setNoOfCars(10);
        assertEquals(10, dodgems.getNoOfCars());
    }

}