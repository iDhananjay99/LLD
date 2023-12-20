package LLD.ObserverDesignPattern.Observers;

import LLD.ObserverDesignPattern.Observables.StockObservable;

public class EmailAlertObserver implements NotificationSystem{
    String emailId;
    StockObservable stock;

    public EmailAlertObserver(String emailId, StockObservable stock){
        this.emailId = emailId;
        this.stock = stock;
    }
    @Override
    public void update() {
        String msg = "product is in stock, order now>>>>";
        sendMail(msg);
    }

    private void sendMail(String msg){
        System.out.println("Send Mail to "+emailId + ", "+msg);
    }
}
