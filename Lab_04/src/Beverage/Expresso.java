package Beverage;

import Beverage.Beverage;

public class Expresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }
    @Override
    public double cost()
    {
        return 220.00;
    }
}
