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
    public void hasPriceBought() {
        assertEquals(200, piano.getPriceBought());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("KeyBoard", piano.getInstrumentType().getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(220, piano.getPrice());
    }
    @Test
    public void hasNumOfKeys() {
        assertEquals(88, piano.getNumOfKeys());

    }
}
