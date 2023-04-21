package instruments;

public class Saxophone extends Instrument {
    private int keyValues;

    public Saxophone(String modelBrand, String color, int priceBought, InstrumentType instrumentType, int price, int keyValues) {
        super(modelBrand, color, priceBought, instrumentType, price);
        this.keyValues = keyValues;
    }

    public int getKeyValues() {
        return keyValues;
    }
}
