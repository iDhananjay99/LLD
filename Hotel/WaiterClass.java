package LLD.Hotel;

public class WaiterClass implements Waiter{
    String dishName;
    ChefClass chef;
    int orderId;
    String waiterName;
    int totalOrders;

    WaiterClass(String name, int arr[], String dish, int id, int orderCount){
        this.orderId = id;
        this.dishName = dish;
        this.waiterName = name;
        this.totalOrders = orderCount;
    }
    @Override
    public void takeOrder() {
        chef = new ChefClass("Ravi");
        chef.orderName(this.dishName, this.orderId);
    }

    @Override
    public void calcBill() {
        if(chef.isFoodCooked()) {
            System.out.println("Bills of OrderId " + this.orderId + ": " + 100 * this.totalOrders);
        }
        else{
            System.out.println("Food Not Ordered/Prepared");
        }
    }
}
