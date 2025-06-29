import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList();
    private double stockPrice;

    public void registerObserver(Observer var1) {
        this.observers.add(var1);
    }

    public void deregisterObserver(Observer var1) {
        this.observers.remove(var1);
    }

    public void notifyObservers() {
        for(Observer var2 : this.observers) {
            var2.update(this.stockPrice);
        }

    }

    public void setStockPrice(double var1) {
        this.stockPrice = var1;
        this.notifyObservers();
    }
}
