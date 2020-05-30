package pizza.base;

public abstract class Pizza {
    public String description = "Unknown pizza";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}