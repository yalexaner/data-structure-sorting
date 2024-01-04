// Очередь
package generator;

import structure.Queue;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class QueueGenerator {

    public static Queue generate(int elementsAmount) {
        // Создаём пустую очередь
        Random rand = new Random();
        Queue queue = new Queue();

        // Начинаем замер времени заполнения
        Instant start = Instant.now();

        // Заполняем очередь элементами в количестве elementsAmount
        for (int i = 0; i < elementsAmount; i++) {
            queue.enqueue(1 + rand.nextInt(elementsAmount));
        }

        // Заканчиваем замер времени заполнения
        Instant end = Instant.now();

        System.out.println("Время заполнения очереди " + Duration.between(start, end).toMillis() + " мс\n");

        return queue;
    }
}
