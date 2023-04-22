package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {
    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Drum Sticks", 30, 50);
    }

    @Test
    public void hasDrumSticks() {
        assertEquals("Drum Sticks", drumStick.getDescription());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(30, drumStick.getBoughtPrice());
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(50, drumStick.getSellPrice());
    }

    @Test
    public void hasMarkUpValue() {
        assertEquals(66, drumStick.calculateMarkup(drumStick.getBoughtPrice(), drumStick.getSellPrice()));
    }
}
