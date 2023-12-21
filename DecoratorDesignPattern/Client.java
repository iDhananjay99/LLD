package LLD.DecoratorDesignPattern;

import LLD.DecoratorDesignPattern.Toppings.ExtraCheese;
import LLD.DecoratorDesignPattern.Toppings.Jalapino;
import LLD.DecoratorDesignPattern.Toppings.ToppingsDecorator;

public class Client {
    public static void main(String []args){
        BasePizza base = new VeggieDelight();
        ToppingsDecorator toppings = new ExtraCheese(base);
        toppings = new Jalapino(toppings);
        System.out.println(toppings.cost());
    }
}
