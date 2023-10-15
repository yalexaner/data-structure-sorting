package generator;

import java.util.Random;
import java.util.Vector;

/**
 * VectorList - синхронизованная структура данных
 * <p>
 * Она безопасна для использования в многопоточной среде. Однако эта синхронизация идет в ущерб производительности.
 * <p>
 * Сложность: добавление - O(1), получение элемента - O(1).
 */
public class VectorGenerator {

    public static Vector<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        Vector<Integer> list = new Vector<>();
        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }
        return list;
    }
}
