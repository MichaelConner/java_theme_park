package Attractions;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Sicko Mode", 100);

        visitor1 = new Visitor(13, 1.46, 10.00);
        visitor2 = new Visitor(13, 1.45, 10.00);
        visitor3 = new Visitor(12, 1.46, 10.00);
        visitor4 = new Visitor(12, 1.45, 10.00);
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

    @Test
    public void canCheckOldEnoughAndTallEnough() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckOldEnoughButTooShort() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canCheckTallEnoughButTooYoung() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void canCheckNeitherOldEnoughOrTallEnough() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor4));
    }
    
}
