package instruments;

public class Drum extends Instrument{
    private int numOfDrums;

    public Drum(String modelBrand, String color, int buyingPrice, InstrumentType instrumentType, int sellingPrice, int numOfDrums) {
        super(modelBrand, color, buyingPrice, instrumentType, sellingPrice);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }
}
