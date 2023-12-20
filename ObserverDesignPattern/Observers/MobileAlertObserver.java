package LLD.ObserverDesignPattern.Observers;

import LLD.ObserverDesignPattern.Observables.StockObservable;

public class MobileAlertObserver implements NotificationSystem{

    String mobile;
    StockObservable stock;

    MobileAlertObserver(String number, StockObservable stock){
        this.mobile = number;
        this.stock = stock;
    }
    @Override
    public void update() {
        String msg = "product is in stock hurry up, order now>>>>";
        sendSms(msg);
    }

    private void sendSms(String msg){
        System.out.println("Sms Mail to "+ mobile + ", "+msg);
    }
}
