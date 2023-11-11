package generator;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Random;

/**
 * LinkedList - это реализация двусвязного списка.
 * <p>
 * Элементы LinkedList связаны между собой через ссылки next и previous, образуя цепочку ссылок.
 * В отличие от ArrayList, в LinkedList нет внутреннего массива, все операции сводятся к изменению ссылок.
 * <p>
 * Сложность: добавление - O(1), получение элемента - O(n).
 */
public class ListGenerator {

    public static LinkedList<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        Instant start = Instant.now();

        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }

        Instant end = Instant.now();

        System.out.println("Время заполнения списка " + Duration.between(start, end).toMillis() / 1000f + " секунд");

        return list;
    }
}
