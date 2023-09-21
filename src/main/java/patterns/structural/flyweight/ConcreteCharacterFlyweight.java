package patterns.structural.flyweight;

public class ConcreteCharacterFlyweight implements CharacterFlyweight {

    char characterGlyph;

    public ConcreteCharacterFlyweight(char characterGlyph) {
        this.characterGlyph = characterGlyph;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character: " + characterGlyph + " at position (" + x + ", " + y + ")");
    }
}
