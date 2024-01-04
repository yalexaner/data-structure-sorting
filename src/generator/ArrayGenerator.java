// Массив
package generator;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;


public class ArrayGenerator {

    public static ArrayList<Integer> generate(int elementsAmount) {
        // Создаём пустой массив с заданным количеством ячеек (elementsAmount)
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>(elementsAmount);

        // Начинаем замер времени заполнения
        Instant start = Instant.now();

        // Заполняем словарь элементами в количестве elementsAmount
        for (int i = 0; i < elementsAmount; i++) {
            array.add(1 + rand.nextInt(elementsAmount));
        }

        // Заканчиваем замер времени заполнения
        Instant end = Instant.now();

        System.out.println("Время заполнения массива " + Duration.between(start, end).toMillis() + " мс\n");

        return array;
    }
}
