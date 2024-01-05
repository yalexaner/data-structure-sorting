package sorting;

import structure.BaseStructure;
import utility.SortingProgress;

import java.util.HashMap;
import java.util.List;

/**
 * Сортировка выбором.
 * <p>
 * Алгоритм работает путем нахождения минимального элемента в неотсортированном подсписке
 * и обмена его с крайним левым неотсортированным элементом, помещая его в отсортированном порядке.
 * Этот процесс повторяется для оставшегося неотсортированного подсписка.
 * <p>
 * Сложность: в любом случае - O(n^2).
 */
public class SelectionSort implements BaseSort {

    /**
     * Метод sort(List<Integer> list): Этот метод сортирует список целых чисел, используя алгоритм сортировки выбором.
     * SortingProgress progress = new SortingProgress(list.size()); - Это создает новый объект SortingProgress, который, вероятно, используется для отслеживания и отображения прогресса сортировки. Размер списка передается в конструктор.
     * for (int i = 0; i < n - 1; i++) {...} - Этот внешний цикл проходит по каждому элементу списка, кроме последнего. Переменная i представляет индекс текущего шага сортировки.
     * progress.printProgressMessage(); - Это, вероятно, печатает сообщение о текущем прогрессе сортировки.
     * int minIdx = i; - Это инициализирует переменную minIdx, которая будет хранить индекс наименьшего элемента, найденного в неотсортированной части списка.
     * for (int j = i + 1; j < n; j++) {...} - Этот внутренний цикл проходит по неотсортированной части списка, начиная с элемента сразу после текущего i, чтобы найти наименьший элемент.
     * if (list.get(j) < list.get(minIdx)) {...} - Если текущий элемент меньше элемента с индексом minIdx, обновляем minIdx на индекс текущего элемента.
     * После завершения внутреннего цикла, элементы с индексами minIdx и i меняются местами, помещая наименьший найденный элемент на начальную позицию неотсортированной части списка.
     * progress.clearOutput(); - Это, вероятно, очищает или скрывает сообщение о прогрессе сортировки после завершения сортировки.
     * @param list массив или список
     */
    @Override
    public void sort(List<Integer> list) {
        SortingProgress progress = new SortingProgress(list.size());

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = list.get(minIdx);
            list.set(minIdx, list.get(i));
            list.set(i, temp);
        }

        progress.clearOutput();
    }

    @Override
    public void sort(HashMap<Integer, Integer> map) {
        SortingProgress progress = new SortingProgress(map.size());

        int n = map.size();
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (map.get(j) < map.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = map.get(minIdx);
            map.put(minIdx, map.get(i));
            map.put(i, temp);
        }

        progress.clearOutput();
    }

    @Override
    public void sort(BaseStructure structure) {
        SortingProgress progress = new SortingProgress(structure.size());

        int n = structure.size();
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (structure.get(j) < structure.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = structure.get(minIdx);
            structure.set(minIdx, structure.get(i));
            structure.set(i, temp);
        }

        progress.clearOutput();
    }
}
