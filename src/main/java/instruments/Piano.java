package instruments;

public class Piano extends Instrument{
private int numOfKeys;

    public Piano(String modelBrand, String color, int priceBought, InstrumentType instrumentType, int price, int numOfKeys) {
        super(modelBrand, color, priceBought, instrumentType, price);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
