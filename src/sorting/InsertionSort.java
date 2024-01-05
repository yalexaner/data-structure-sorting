package sorting;

import structure.BaseStructure;
import utility.SortingProgress;

import java.util.HashMap;
import java.util.List;

/**
 * Сортировка вставками.
 * <p>
 * Алгоритм работает по принципу поэлементного формирования отсортированного массива.
 * На каждом шаге алгоритма выбирается один из элементов входных данных и помещается на нужную позицию в уже отсортированной последовательности
 * до тех пор, пока набор входных данных не будет исчерпан.
 * <p>
 * Сложность: в худшем случае - O(n^2), в лучшем - O(n).
 */
public class InsertionSort implements BaseSort {

    /**
     * Этот метод проходит по каждому элементу списка, начиная со второго, и вставляет его в отсортированную часть списка перед ним.
     * SortingProgress progress = new SortingProgress(list.size()); - Это создает новый объект SortingProgress, который, вероятно, используется для отслеживания и отображения прогресса сортировки. Размер списка передается в конструктор.
     * for (int i = 1; i < n; ++i) {...} - Этот цикл проходит по каждому элементу списка, начиная со второго элемента (индекс 1).
     * progress.printProgressMessage(); - Это, вероятно, печатает сообщение о прогрессе сортировки.
     * int key = list.get(i); - Это выбирает элемент, который нужно вставить в отсортированную часть списка.
     * while (j >= 0 && list.get(j) > key) {...} - Этот цикл перемещает элементы, которые больше ключа, на одну позицию вперед, чтобы освободить место для вставки ключа.
     * list.set(j + 1, key); - Это вставляет ключ на правильное место в отсортированной части списка.
     * progress.clearOutput(); - Это, вероятно, очищает или скрывает сообщение о прогрессе сортировки после завершения сортировки.
     *
     * @param list массив или список
     */
    @Override
    public void sort(List<Integer> list) {
        SortingProgress progress = new SortingProgress(list.size());

        int n = list.size();
        for (int i = 1; i < n; ++i) {
            progress.printProgressMessage();

            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }

        progress.clearOutput();
    }

    @Override
    public void sort(HashMap<Integer, Integer> map) {
        SortingProgress progress = new SortingProgress(map.size());

        int n = map.size();
        for (int i = 1; i < n; ++i) {
            progress.printProgressMessage();

            int key = map.get(i);
            int j = i - 1;
            while (j >= 0 && map.get(j) > key) {
                map.put(j + 1, map.get(j));
                j = j - 1;
            }
            map.put(j + 1, key);
        }

        progress.clearOutput();
    }

    @Override
    public void sort(BaseStructure structure) {
        SortingProgress progress = new SortingProgress(structure.size());

        int n = structure.size();
        for (int i = 1; i < n; ++i) {
            progress.printProgressMessage();

            int key = structure.get(i);
            int j = i - 1;
            while (j >= 0 && structure.get(j) > key) {
                structure.set(j + 1, structure.get(j));
                j = j - 1;
            }
            structure.set(j + 1, key);
        }

        progress.clearOutput();
    }
}
