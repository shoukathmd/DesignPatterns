package flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        ConcreteFlyweightFactory factory = new ConcreteFlyweightFactory();

        String document = "AAABBBCCC";
        int length = document.length();

        for (int i = 0; i < length; i++) {
            CharacterFlyweight character = factory.getCharacterFlyweight(document.charAt(i));
            character.display(i, 0); // Display each character at position (i, 0).
        }
    }
}
