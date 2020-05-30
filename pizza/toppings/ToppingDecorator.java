package pizza.toppings;

import pizza.base.Pizza;

public abstract class ToppingDecorator extends Pizza {
    public Pizza base;
    public abstract String getDescription();
    
}