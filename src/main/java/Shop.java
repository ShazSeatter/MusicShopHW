import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }
}
