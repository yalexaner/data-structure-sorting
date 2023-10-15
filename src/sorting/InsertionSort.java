package sorting;

import utility.SortingProgress;

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

    public void sort(int[] arr) {
        SortingProgress progress = new SortingProgress(arr.length);

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            progress.printProgressMessage();

            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        progress.clearOutput();
    }
}
