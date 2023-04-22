package instruments;

public class Saxophone extends Instrument {
    private int keyValues;

    public Saxophone(String modelBrand, String color, int buyingPrice, InstrumentType instrumentType, int sellingPrice, int keyValues) {
        super(modelBrand, color, buyingPrice, instrumentType, sellingPrice);
        this.keyValues = keyValues;
    }

    public int getKeyValues() {
        return keyValues;
    }
}
