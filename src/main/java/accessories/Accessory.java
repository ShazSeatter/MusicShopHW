package accessories;

public abstract class Accessory {
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
}
