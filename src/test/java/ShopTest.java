import instruments.Drum;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before() {
        shop = new Shop();
    }

    @Test
    public void canAddToStock() {
        Drum drum = new Drum("Yamaha Drum", "red", 100, InstrumentType.PERCUSSION, 200, 5);
        shop.addStock(drum);
        assertEquals("Yamaha Drum", drum.getModelBrand());
    }

    @Test
    public void canRemoveFromStock() {
        Drum drum = new Drum("Yamaha Drum", "red", 100, InstrumentType.PERCUSSION, 200, 5);
        Guitar guitar = new Guitar("Yamaha Guitar", "brown", 100, InstrumentType.STRING, 140, 6);
        shop.addStock(drum);
        shop.addStock(guitar);
        shop.removeStock(drum);
        assertEquals(1, shop.getStockCount());
    }
}
