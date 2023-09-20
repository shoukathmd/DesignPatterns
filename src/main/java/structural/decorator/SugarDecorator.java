package structural.decorator;

public class SugarDecorator extends CoffeeDecorator{
   // protected  Coffee coffee;
    public SugarDecorator(Coffee coffee) {
        super(coffee);
       // this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost() + 1.0;
    }

    public String description(){
        return coffee.description() + " " + "Sugar";
    }
}
