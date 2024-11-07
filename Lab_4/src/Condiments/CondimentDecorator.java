package Condiments;

import Beverage.Beverage;

public abstract class CondimentDecorator implements Beverage {
   protected Beverage beverage;
   public CondimentDecorator(Beverage beverage)
   {
       this.beverage=beverage;
   }
   @Override
    public String getDescription(){
       return beverage.getDescription();
   };

}
