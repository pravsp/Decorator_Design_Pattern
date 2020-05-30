import coffeshop.beverage.*;
import coffeshop.condiment.*;
import pizza.base.Pizza;
import pizza.base.ThickCrust;
import pizza.base.ThinCrust;
import pizza.toppings.Cheese;
import pizza.toppings.Olives;
import pizza.toppings.Pepper;

public class Shop {
    public static void main(String[] args) {
        Shop.coffeeshop();
        Shop.pizzashop();
    }
    public static void pizzashop(){
        System.out.println("Start Pizza Shop");
        System.out.println("================");
        Pizza p1 = new ThickCrust();
        p1 = new Cheese(p1);
        p1 = new Pepper(p1);
        p1 = new Olives(p1);

        System.out.printf(p1.getDescription() + " $%f\n", p1.cost());

        Pizza p2 = new ThinCrust();
        p2 = new Cheese(p2);
        p2 = new Cheese(p2);

        System.out.printf(p2.getDescription() + " $%f\n", p2.cost());

    }
    public static void coffeeshop(){
        System.out.println("Start Coffee Shop");
        System.out.println("=================");
        Beverage b1 = new DarkRoast();
        b1 = new Mocha(b1);
        b1 = new Milk(b1);

        System.out.printf(b1.getDescription() + " $%f\n", b1.cost());

        Beverage b2 = new Expresso();
        b2 = new Soy(b2);
        b2 = new Whip(b2);
        System.out.printf(b2.getDescription() + " $%f\n", b2.cost());

        Beverage b3 = new Decaf();
        b3 = new Mocha(b3);
        b3 = new Mocha(b3);
        b3 = new Mocha(b3);
        System.out.printf(b3.getDescription() + " $%f\n", b3.cost());

    }
}