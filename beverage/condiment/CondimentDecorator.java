package beverage.condiment;

import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();
}