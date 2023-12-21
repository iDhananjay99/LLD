package LLD.DecoratorDesignPattern.Toppings;

import LLD.DecoratorDesignPattern.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza base;

    public Mushroom(BasePizza pizza){
        this.base = pizza;
    }
    @Override
    public int cost(){
        return this.base.cost() + 20;
    }
}
