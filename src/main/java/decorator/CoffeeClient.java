package decorator;

public class CoffeeClient {

    public static void main(String[] args) {
//        Coffee basicCoffee = new BasicCoffee();
//        Coffee milkDecorator =  new MilkDecorator(basicCoffee);
//        Coffee sugarDecorator =  new SugarDecorator(milkDecorator);
//        System.out.println(sugarDecorator.cost());
//        System.out.println(sugarDecorator.description());

        Coffee basicCoffee = new BasicCoffee();
        printCoffeeDetails(basicCoffee);

        // Order a basic coffee with milk
        Coffee coffeeWithMilk = new MilkDecorator(new BasicCoffee());
        printCoffeeDetails(coffeeWithMilk);

        // Order a basic coffee with milk and sugar
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        printCoffeeDetails(coffeeWithMilkAndSugar);

        // Order a basic coffee with just sugar
        Coffee coffeeWithSugar = new SugarDecorator(new BasicCoffee());
        printCoffeeDetails(coffeeWithSugar);
    }

    public static void printCoffeeDetails(Coffee coffee) {
        System.out.println("Description: " + coffee.description() + "\nCost: $" + coffee.cost() + "\n");
    }
}
