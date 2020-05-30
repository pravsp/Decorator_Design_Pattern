import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Decaf;
import beverage.Expresso;
import beverage.condiment.Milk;
import beverage.condiment.Mocha;
import beverage.condiment.Soy;
import beverage.condiment.Whip;

public class CoffeeShop {
    public static void main(String[] args) {
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