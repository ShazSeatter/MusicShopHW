package instruments;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Yamaha Guitar", "brown", 100, InstrumentType.STRING, 140, 6);
    }

    @Test
    public void hasModelBrand() {
        assertEquals("Yamaha Guitar", guitar.getModelBrand());

    }
    @Test
    public void hasColor() {
        assertEquals("brown", guitar.getColor());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100, guitar.getBuyingPrice());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("String", guitar.getInstrumentType().getName());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(140, guitar.getSellingPrice());
    }
    @Test
    public void hasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());

    }
    @Test
    public void hasSound() {
        assertEquals("Twang", guitar.play());
    }
}