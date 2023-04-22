package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Guitar Strings", 50, 100);
    }

    @Test
    public void hasDrumSticks() {
        assertEquals("Guitar Strings", guitarString.getDescription());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(50, guitarString.getBoughtPrice());
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(100, guitarString.getSellPrice());
    }
}
