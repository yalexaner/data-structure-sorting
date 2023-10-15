package sorting;

/**
 * Сортировка кучей.
 * <p>
 * Алгоритм сортировки использует структуру данных "Двоичная куча".
 * Основная идея - в поиске максимального элемента в неотсортированной части массива и его перемещении в конец этого подмассива.
 * <p>
 * Сложность: в любом случае - O(n*log(n)).
 */
public class HeapSort implements BaseSort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
