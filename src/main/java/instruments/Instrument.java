package instruments;

public abstract class Instrument {

    private String modelBrand;
    private String color;
    private int price;

    private InstrumentType instrumentType;

    public Instrument(String modelBrand, String color, int price, InstrumentType instrumentType) {
        this.modelBrand = modelBrand;
        this.color = color;
        this.price = price;
        this.instrumentType = instrumentType;
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
