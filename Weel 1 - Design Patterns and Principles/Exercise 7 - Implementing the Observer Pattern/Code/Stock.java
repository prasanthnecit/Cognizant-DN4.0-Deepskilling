public interface Stock {
    void registerObserver(Observer var1);

    void deregisterObserver(Observer var1);

    void notifyObservers();
}