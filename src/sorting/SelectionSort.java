package sorting;

import utility.SortingProgress;

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

    public void sort(int[] arr) {
        SortingProgress progress = new SortingProgress(arr.length);

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        progress.clearOutput();
    }
}
