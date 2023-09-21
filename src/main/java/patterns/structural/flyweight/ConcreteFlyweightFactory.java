package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConcreteFlyweightFactory {

    Map<Character, CharacterFlyweight> flyweightMap = new HashMap<>();

    public CharacterFlyweight getCharacterFlyweight(char input){
        if (flyweightMap.containsKey(input)) {
            return flyweightMap.get(input);
        }
        CharacterFlyweight entry = new ConcreteCharacterFlyweight(input);
        flyweightMap.put(input, entry);
        return entry;
    }
}
