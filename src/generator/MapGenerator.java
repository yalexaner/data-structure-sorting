package generator;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Random;

public class MapGenerator {

    public static HashMap<Integer, Integer> generate(int elementsAmount) {
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        Instant start = Instant.now();

        for (int i = 0; i < elementsAmount; i++) {
            map.put(i, 1 + rand.nextInt(elementsAmount));
        }

        Instant end = Instant.now();

        System.out.println("Время заполнения списка " + Duration.between(start, end).toMillis() / 1000f + " секунд");

        return map;
    }
}
