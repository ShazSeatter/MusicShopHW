package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;
    public Guitar(String modelBrand, String color, int price, InstrumentType instrumentType, int numOfStrings) {
        super(modelBrand, color, price, instrumentType);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }


}
