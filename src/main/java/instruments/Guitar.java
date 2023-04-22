package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;

    public Guitar(String modelBrand, String color, int buyingPrice, InstrumentType instrumentType, int sellingPrice, int numOfStrings) {
        super(modelBrand, color, buyingPrice, instrumentType, sellingPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String play() {
        return "Twang";
    }
}
