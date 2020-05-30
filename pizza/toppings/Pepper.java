package pizza.toppings;

import pizza.base.Pizza;

public class Pepper extends ToppingDecorator{
    public Pepper(Pizza base){
        this.base = base;
    }

    public String getDescription(){
        return this.base.getDescription() + ", Pepper";
    }

    public double cost(){
        return this.base.cost() + 0.29;
    }
    
}