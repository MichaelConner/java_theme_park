package Attractions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlaygroundTest {

    private Playground playground;

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

}