package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Yamaha", "gold", 50, InstrumentType.BRASS, 140, 22);
    }

    @Test
    public void hasModelBrand() {
        assertEquals("Yamaha", saxophone.getModelBrand());

    }
    @Test
    public void hasColor() {
        assertEquals("gold", saxophone.getColor());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(50, saxophone.getBuyingPrice());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("Brass", saxophone.getInstrumentType().getName());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(140, saxophone.getSellingPrice());
    }
    @Test
    public void hasKeyValues() {
        assertEquals(22, saxophone.getKeyValues());
    }
}
