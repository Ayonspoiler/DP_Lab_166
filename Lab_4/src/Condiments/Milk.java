package Condiments;

import Beverage.Beverage;

public class Milk extends CondimentDecorator  {
    public Milk(Beverage beverage)
    {
        super(beverage);
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Milk";
    }
    @Override

    public double cost() {
        return beverage.cost() + 50.00;
    }


}
