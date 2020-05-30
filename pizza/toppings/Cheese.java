package pizza.toppings;

import pizza.base.Pizza;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza base){
        this.base = base;
    }

    public String getDescription() {
        return this.base.getDescription() + ", cheese";
    }

    public double cost(){
        return this.base.cost() + 0.45;
    }
    
}