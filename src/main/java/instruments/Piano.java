package instruments;

public class Piano extends Instrument{
private int numOfKeys;

    public Piano(String modelBrand, String color, int buyingPrice, InstrumentType instrumentType, int sellingPrice, int numOfKeys) {
        super(modelBrand, color, buyingPrice, instrumentType, sellingPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }


    @Override
    public String play() {
        return "Ting Ting";
    }
}
