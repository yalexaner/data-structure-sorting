package generator;

import structure.Queue;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class QueueGenerator {

    public static Queue generate(int elementsAmount) {
        Random rand = new Random();
        Queue queue = new Queue();

        Instant start = Instant.now();

        for (int i = 0; i < elementsAmount; i++) {
            queue.enqueue(1 + rand.nextInt(elementsAmount));
        }

        Instant end = Instant.now();

        System.out.println("Время заполнения списка " + Duration.between(start, end).toMillis() / 1000f + " секунд");

        return queue;
    }
}
