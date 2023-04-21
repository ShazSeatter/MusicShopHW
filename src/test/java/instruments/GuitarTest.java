package instruments;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Yamaha", "brown", 100, InstrumentType.STRING, 6);
    }

    @Test
    public void hasModelBrand() {
        assertEquals("Yamaha", guitar.getModelBrand());

    }
    @Test
    public void hasColor() {
        assertEquals("brown", guitar.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(100, guitar.getPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("String", guitar.getInstrumentType().getName());
    }
}