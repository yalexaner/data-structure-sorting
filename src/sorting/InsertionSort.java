package sorting;

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
}
