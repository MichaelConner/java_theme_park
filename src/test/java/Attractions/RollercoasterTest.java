package Attractions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Sicko Mode", 100);
    }


    @Test
    public void hasName(){
        assertEquals("Sicko Mode", rollercoaster.getName());
    }

    @Test
    public void canChangeName(){
        rollercoaster.setName("Astrothunder");
        assertEquals("Astrothunder", rollercoaster.getName());
    }

    @Test
    public void hasMaxSpeed(){
        assertEquals(100, rollercoaster.getMaxSpeed());
    }

    @Test
    public void canChangeMaxSpeed(){
        rollercoaster.setMaxSpeed(120);
        assertEquals(120, rollercoaster.getMaxSpeed());
    }








}
