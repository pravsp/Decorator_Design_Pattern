package coffeshop.condiment;

import coffeshop.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();
}