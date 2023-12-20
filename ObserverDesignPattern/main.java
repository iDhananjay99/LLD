package LLD.ObserverDesignPattern;

import LLD.ObserverDesignPattern.Observables.IphoneObservable;
import LLD.ObserverDesignPattern.Observables.StockObservable;
import LLD.ObserverDesignPattern.Observers.EmailAlertObserver;
import LLD.ObserverDesignPattern.Observers.NotificationSystem;

public class main {
    public static void main(String [] args) {

        StockObservable iphoneObservable = new IphoneObservable();

        NotificationSystem user1 = new EmailAlertObserver("user1@gmail.com", iphoneObservable);
        NotificationSystem user2 = new EmailAlertObserver("user2@gmail.com", iphoneObservable);

        iphoneObservable.add(user1);
        iphoneObservable.add(user2);

        iphoneObservable.setStockCount(10);
        iphoneObservable.getStockCount();
    }


}
