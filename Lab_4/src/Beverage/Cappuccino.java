package Beverage;

import Beverage.Beverage;

public class Cappuccino implements Beverage {
    @Override
    public String getDescription()
    {
        return "Beverage.Cappuccino";
    }
    @Override
    public double cost()
    {
        return 280.00;
    }


}
