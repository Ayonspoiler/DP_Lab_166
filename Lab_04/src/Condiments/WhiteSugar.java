package Condiments;

import Beverage.Beverage;

public class WhiteSugar extends CondimentDecorator {


    public WhiteSugar(Beverage beverage)
    {
        super(beverage);
    }
@Override
    public String getDescription()
    {
        return beverage.getDescription()+" ,White Sugar";
    }
    @Override

    public double cost()
    {
        return beverage.cost()+30.00;
    }


}
