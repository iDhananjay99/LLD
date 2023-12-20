package LLD.ObserverDesignPattern.Observables;

import LLD.ObserverDesignPattern.Observers.NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    public List<NotificationSystem> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationSystem obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationSystem obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyToUser() {
        for(NotificationSystem data: observerList){
            data.update();
        }
    }

    @Override
    public void setStockCount(int stockAdded) {
        if(stockCount == 0 && stockAdded > 0){
            notifyToUser();
        }
        stockCount += stockAdded;
    }

    @Override
    public void getStockCount() {
        System.out.println("Stock of Iphone: "+stockCount);
    }
}
