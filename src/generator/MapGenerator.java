package generator;

import java.util.HashMap;
import java.util.Random;

public class MapGenerator {

    public static HashMap<Integer, Integer> generate(int elementsAmount) {
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elementsAmount; i++) {
            map.put(i, 1 + rand.nextInt(elementsAmount));
        }

        return map;
    }
}
