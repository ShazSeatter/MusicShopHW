package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {
    private String description;
    private int boughtPrice;
    private int sellPrice;

    public Accessory(String description, int boughtPrice, int sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calculateMarkup(int buyingPrice, int sellingPrice) {
        return 0;
    }
}
