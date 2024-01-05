package sorting;

import structure.BaseStructure;
import utility.SortingProgress;

import java.util.HashMap;
import java.util.List;

/**
 * Сортировка пузырьком.
 * <p>
 * Она работает путем последовательного прохода по массиву, сравнивая каждую пару соседних элементов.
 * Если элементы расположены в неправильном порядке, они меняются местами.
 * Этот процесс повторяется до тех пор, пока массив не будет полностью отсортирован.
 * <p>
 * Сложность: в худшем случае - O(n^2), в лучшем - O(n).
 */
public class BubbleSort implements BaseSort {

    /**
     * Этот код представляет собой метод сортировки списка целых чисел с использованием алгоритма пузырьковой сортировки. Вот подробное объяснение:
     * Метод sort принимает в качестве параметра список целых чисел (List<Integer> list), который нужно отсортировать.
     * В начале метода создается объект SortingProgress, который, судя по всему, используется для отслеживания и вывода прогресса сортировки. Его размер инициализируется размером списка.
     * Затем начинается процесс сортировки. Внешний цикл for проходит по каждому элементу списка, кроме последнего. После каждой итерации этого цикла вызывается метод printProgressMessage() объекта progress, который, вероятно, выводит сообщение о прогрессе сортировки.
     * Внутренний цикл for проходит по оставшимся элементам списка. Если текущий элемент больше следующего, они меняются местами. Это основная идея пузырьковой сортировки: "пузырьки" больших чисел "всплывают" к верху списка (концу списка), пока список не будет полностью отсортирован.
     * После завершения сортировки вызывается метод clearOutput() объекта progress, который, вероятно, очищает или скрывает вывод прогресса сортировки.
     * Обратите внимание, что точное поведение класса SortingProgress и его методов printProgressMessage() и clearOutput() не указано в предоставленном коде, поэтому я делаю предположения на основе их названий. Если их поведение отличается, объяснение должно быть обновлено соответственно.
     * @param list массив или список
     */
    @Override
    public void sort(List<Integer> list) {
        SortingProgress progress = new SortingProgress(list.size());

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        progress.clearOutput();
    }

    @Override
    public void sort(HashMap<Integer, Integer> map) {
        SortingProgress progress = new SortingProgress(map.size());

        for (int i = 0; i < map.size(); i++) {
            progress.printProgressMessage();

            for (int j = 0; j < map.size() - i - 1; j++) {
                if (map.get(j) > map.get(j + 1)) {
                    int temp = map.get(j);
                    map.put(j, map.get(j + 1));
                    map.put(j + 1, temp);
                }
            }
        }

        progress.clearOutput();
    }

    @Override
    public void sort(BaseStructure structure) {
        SortingProgress progress = new SortingProgress(structure.size());

        int n = structure.size();
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            for (int j = 0; j < n - i - 1; j++) {
                if (structure.get(j) > structure.get(j + 1)) {
                    structure.swap(j, j + 1);
                }
            }
        }

        progress.clearOutput();
    }
}
