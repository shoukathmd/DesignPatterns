package structural.bridge;

public class BridgeClient {

    public static void main(String... args) {
        Shape circle = new Circle(4, 5, new DrawApiTwo());
        circle.draw();

        Shape circle1 = new Circle(15, 35, new DrawApiOne());
        circle1.draw();
    }
}
