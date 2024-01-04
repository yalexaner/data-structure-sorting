// Стек
package generator;

import structure.Stack;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class StackGenerator {

    public static Stack generate(int elementsAmount) {
        // Создаём пустой стек
        Random rand = new Random();
        Stack stack = new Stack();

        // Начинаем замер времени заполнения
        Instant start = Instant.now();

        // Заполняем стек элементами в количестве elementsAmount
        for (int i = 0; i < elementsAmount; i++) {
            stack.enqueue(1 + rand.nextInt(elementsAmount));
        }

        // Заканчиваем замер времени заполнения
        Instant end = Instant.now();

        System.out.println("Время заполнения стека " + Duration.between(start, end).toMillis() + " мс\n");

        return stack;
    }
}
