package LLD.Hotel;

import java.util.Arrays;

public class ChefClass implements Chef {
    String chefName;
    boolean isCooked;
    ChefClass(String name){
        this.chefName = name;
    }
    String dishName;
    int orderID;

    @Override
    public void cookDishes() {
        if(Arrays.asList(dishes).contains(dishName)){
            this.isCooked = true;
            System.out.println("Cooking Started...");
        }
        else{
            this.isCooked = false;
            System.out.println("Order From Menu Plz...");
        }
    }

    @Override
    public void orderName(String dish, int id) {
        this.dishName = dish;
        this.orderID = id;
        this.cookDishes();
    }

    @Override
    public boolean isFoodCooked() {
        return this.isCooked;
    }
}
