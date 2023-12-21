package LLD.DecoratorDesignPattern.Toppings;

import LLD.DecoratorDesignPattern.BasePizza;

public class Jalapino extends ToppingsDecorator{
    BasePizza base;

    public Jalapino(BasePizza pizza){
        this.base = pizza;
    }
    @Override
    public int cost(){
        return this.base.cost() + 50;
    }
}
