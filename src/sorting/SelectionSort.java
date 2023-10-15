package sorting;

import utility.SortingProgress;

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
}
