package LLD.DecoratorDesignPattern.Toppings;

import LLD.DecoratorDesignPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
   BasePizza base;

   public ExtraCheese(BasePizza pizza){
       this.base = pizza;
   }
   @Override
   public int cost(){
       return this.base.cost() + 20;
   }
}
