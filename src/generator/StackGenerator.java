package generator;

import structure.Stack;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class StackGenerator {

    public static Stack generate(int elementsAmount) {
        Random rand = new Random();
        Stack stack = new Stack();

        Instant start = Instant.now();

        for (int i = 0; i < elementsAmount; i++) {
            stack.enqueue(1 + rand.nextInt(elementsAmount));
        }

        Instant end = Instant.now();

        System.out.println("Время заполнения списка " + Duration.between(start, end).toMillis() / 1000f + " секунд\n");

        return stack;
    }
}
