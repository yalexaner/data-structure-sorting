package generator;

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
public class ListGenerator implements BaseGenerator {

    @Override
    public LinkedList<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }
        return list;
    }
}
