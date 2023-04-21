package instruments;

public class Drum extends Instrument{
    private int numOfDrums;

    public Drum(String modelBrand, String color, int priceBought, InstrumentType instrumentType, int price, int numOfDrums) {
        super(modelBrand, color, priceBought, instrumentType, price);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }
}
