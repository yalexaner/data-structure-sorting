package generator;

import java.util.ArrayList;
import java.util.Random;

/**
 * ArrayList - структура данных, внутри которой находится массив.
 * <p>
 * У этой структуры данных есть возможность добавлять и удалять элементы,
 * при этом размер массива будет увеличиваться или уменьшаться по мере необходимости.
 * <p>
 * Сложность: добавление - O(1), получение элемента - O(1).
 */
public class ArrayGenerator {

    public static ArrayList<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>(elementsAmount);
        for (int i = 0; i < elementsAmount; i++) {
            array.add(1 + rand.nextInt(elementsAmount));
        }
        return array;
    }
}
