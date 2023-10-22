package sorting;

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
}
