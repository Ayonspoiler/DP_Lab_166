package Condiments;

import Beverage.Beverage;

public class WhippedCream extends CondimentDecorator {
    Beverage beverage;
    public WhippedCream(Beverage beverage)
    {
        super(beverage);
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+" ,Whipped Cream";
    }
    @Override

    public double cost()
    {
        return beverage.cost()+100.00;
    }


}
