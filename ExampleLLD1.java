package LLD;

interface Bike{
    int capacity = 10;
    void turnOnEngine();
    void accelerate();
}
class bullet implements Bike{
    boolean isEngineOn;
    int x = capacity;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
        System.out.println(isEngineOn+" "+x);
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}

class Marker{
    String name;
    String color;
    int cost;
    int expiry;

    Marker(String name, String color, int cost, int expiry){
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.expiry = expiry;
    }
}

class Invoice{
    private Marker marker;
    private int quantity;
    Invoice(Marker m, int quantity){
        this.marker = m;
        this.quantity = quantity;
    }
    int calcCost(){
        return marker.cost * this.quantity;
    }
}

public class ExampleLLD1 {
    public static void main(String [] args){
        Marker m = new Marker("Camel", "Black", 20, 2024);
        Invoice in = new Invoice(m, 10);
        int total = in.calcCost();
        System.out.println(total + " ");

        bullet b = new bullet();
        b.turnOnEngine();
    }
}
