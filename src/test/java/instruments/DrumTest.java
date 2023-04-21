package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum("Yamaha", "red", 100, InstrumentType.PERCUSSION, 200, 5);
    }

    @Test
    public void hasModelBrand() {
        assertEquals("Yamaha", drum.getModelBrand());

    }
    @Test
    public void hasColor() {
        assertEquals("red", drum.getColor());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(100, drum.getPriceBought());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("Percussion", drum.getInstrumentType().getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(200, drum.getPrice());
    }
    @Test
    public void hasNumOfStrings() {
        assertEquals(5, drum.getNumOfDrums());

    }
}
