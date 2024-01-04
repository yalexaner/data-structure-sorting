// Список
package generator;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Random;


public class ListGenerator {

    public static LinkedList<Integer> generate(int elementsAmount) {
        // Создаём пустой список
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        // Начинаем замер времени заполнения
        Instant start = Instant.now();

        // Заполняем список элементами в количестве elementsAmount
        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }

        // Заканчиваем замер времени заполнения
        Instant end = Instant.now();

        System.out.println("Время заполнения списка " + Duration.between(start, end).toMillis() + " мс\n");

        return list;
    }
}
