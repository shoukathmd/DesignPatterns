package patterns.structural.decorator;

public class BasicCoffee implements Coffee{

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}
