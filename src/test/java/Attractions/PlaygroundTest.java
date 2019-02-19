package Attractions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before() {
        playground = new Playground("Yosemite", 7);
    }


    @Test
    public void hasName() {
        assertEquals("Yosemite", playground.getName());
    }

    @Test
    public void canChangeName() {
        playground.setName("Astrothunder");
        assertEquals("Astrothunder", playground.getName());
    }

    @Test
    public void hasFirstAiders() {
        assertEquals(7, playground.getNoOfFirstAiders());
    }

    @Test
    public void canChangeNoOfFirstAiders() {
        playground.setNoOfFirstAiders(10);
        assertEquals(10, playground.getNoOfFirstAiders());
    }

    @Test
    public void canCheckAge() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckAgeTooOld() {
        playground.setNoOfFirstAiders(10);
        assertEquals(false, playground.isAllowedTo(visitor2));
    }





}