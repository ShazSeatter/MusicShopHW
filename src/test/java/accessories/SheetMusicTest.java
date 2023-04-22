package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Sheet Music", 30, 50);
    }

    @Test
    public void hasDrumSticks() {
        assertEquals("Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(30, sheetMusic.getBoughtPrice());
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(50, sheetMusic.getSellPrice());
    }
}
