package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;
    public Guitar(String modelBrand, String color, int priceBought, InstrumentType instrumentType, int price, int numOfStrings) {
        super(modelBrand, color, priceBought, instrumentType, price);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }


}
