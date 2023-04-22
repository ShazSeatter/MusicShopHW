package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Roland", "black", 200, InstrumentType.KEYBOARD, 220, 88);
    }

    @Test
    public void hasModelBrand() {
        assertEquals("Roland", piano.getModelBrand());

    }
    @Test
    public void hasColor() {
        assertEquals("black", piano.getColor());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200, piano.getBuyingPrice());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("KeyBoard", piano.getInstrumentType().getName());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(220, piano.getSellingPrice());
    }
    @Test
    public void hasNumOfKeys() {
        assertEquals(88, piano.getNumOfKeys());

    }
}
