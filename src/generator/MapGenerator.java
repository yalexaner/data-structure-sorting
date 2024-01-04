package generator;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Random;

public class MapGenerator {

    public static HashMap<Integer, Integer> generate(int elementsAmount) {
        // Создаём пустой словарь
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Начинаем замер времени заполнения
        Instant start = Instant.now();

        for (int i = 0; i < elementsAmount; i++) {
            map.put(i, 1 + rand.nextInt(elementsAmount));
        }

        // Заканчиваем замер времени заполнения
        Instant end = Instant.now();

        System.out.println("Время заполнения словаря " + Duration.between(start, end).toMillis() + " мс\n");

        return map;
    }
}
