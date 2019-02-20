package Visitor;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.52, 10.00);
    }


    @Test
    public void hasAge(){
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.52, visitor.getHeight(),0.00);
    }

    @Test
    public void hasWallet(){
        assertEquals(10.00, visitor.getWallet(),0.00);
    }

    @Test
    public void canSetAge(){
        visitor.setAge(16);
        assertEquals(16, visitor.getAge());
    }

    @Test
    public void canSetHeight(){
        visitor.setHeight(1.46);
        assertEquals(1.46, visitor.getHeight(), 0.00);
    }

    @Test
    public void canSetWallet(){
        visitor.setWallet(11.52);
        assertEquals(11.52, visitor.getWallet(), 0.00);
    }






}

