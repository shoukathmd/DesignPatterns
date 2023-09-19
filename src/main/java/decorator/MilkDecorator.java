package decorator;

public class MilkDecorator extends CoffeeDecorator{
    //private Coffee coffee;
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 1.0;
    }

    public String description(){
        return coffee.description() + " " + "Milk";
    }
}
