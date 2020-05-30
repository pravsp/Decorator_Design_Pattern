package pizza.toppings;

import pizza.base.Pizza;

public class Olives extends ToppingDecorator{
    public Olives(Pizza base){
        this.base = base;
    }

    public String getDescription(){
        return this.base.getDescription() + ", Olives";
    }

    public double cost(){
        return this.base.cost() + 0.69;
    }
    
}