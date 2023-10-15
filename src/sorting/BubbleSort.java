package sorting;

import utility.SortingProgress;

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

    public void sort(int[] arr) {
        SortingProgress progress = new SortingProgress(arr.length);

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            progress.printProgressMessage();

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        progress.clearOutput();
    }
}
