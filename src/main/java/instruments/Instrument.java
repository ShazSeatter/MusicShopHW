package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String modelBrand;
    private String color;
    private int buyingPrice;

    private InstrumentType instrumentType;

    private int sellingPrice;

    public Instrument(String modelBrand, String color, int buyingPrice, InstrumentType instrumentType, int sellingPrice) {
        this.modelBrand = modelBrand;
        this.color = color;
        this.buyingPrice = buyingPrice;
        this.instrumentType = instrumentType;
        this.sellingPrice = sellingPrice;
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public String getColor() {
        return color;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    @Override
    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        return 0;
    }
}
