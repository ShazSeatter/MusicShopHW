package instruments;

public abstract class Instrument {

    private String modelBrand;
    private String color;
    private int priceBought;

    private InstrumentType instrumentType;

    private int price;

    public Instrument(String modelBrand, String color, int priceBought, InstrumentType instrumentType, int price) {
        this.modelBrand = modelBrand;
        this.color = color;
        this.priceBought = priceBought;
        this.instrumentType = instrumentType;
        this.price = price;
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public String getColor() {
        return color;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getPrice() {
        return price;
    }
}
