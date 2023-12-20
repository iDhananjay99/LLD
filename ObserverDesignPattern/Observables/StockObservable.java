package LLD.ObserverDesignPattern.Observables;

import LLD.ObserverDesignPattern.Observers.NotificationSystem;

public interface StockObservable {
    void add(NotificationSystem obj);
    void remove(NotificationSystem obj);
    void notifyToUser();
    void setStockCount(int stockAdded);
    void getStockCount();
}