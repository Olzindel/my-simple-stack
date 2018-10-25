package deqo.tthi.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;
    private Object o1;
    private Object o2;

    @Before
    public void setUp() {
        int value = 0;
        o1 = new Integer(value);
        o2 = new Integer(value + 1);
        item = new Item(o1);
    }

    @Test
    public void constructorDoesNotReturnNull() {
        assertNotNull(item);
    }

    @Test
    public void getValue() {
        assertEquals(o1, item.getValue());
    }

    @Test
    public void setValue() {
        item.setValue(o2);
        assertNotEquals(o1,o2);
    }
}