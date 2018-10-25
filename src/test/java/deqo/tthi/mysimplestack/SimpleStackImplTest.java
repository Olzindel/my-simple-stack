package deqo.tthi.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStackImpl simpleStack;

    @Before
    public void setUp() {
        simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(element1));
        assertFalse(simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(element1));
        simpleStack.push(new Item(element1 + "2"));
        assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPeek() throws Exception {
        Item i = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(i);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        assertEquals(1, simpleStack.getSize());
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(i.getValue(), integer);
    }

    @Test
    public void pop() throws Exception {
        Item i1 = new Item(new Integer(0));
        simpleStack.push(i1);
        Item i2 = new Item(new Integer(1));
        simpleStack.push(i2);
        assertEquals(i2, simpleStack.pop());
        assertEquals(i1, simpleStack.peek());
    }

    @Test
    public void push() {
        Item i = new Item(new Integer(0));
        simpleStack.push(i);
        assertEquals(i, simpleStack.peek());
    }
}