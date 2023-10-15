package sorting;

import java.util.List;

/**
 * Сортировка кучей.
 * <p>
 * Алгоритм сортировки использует структуру данных "Двоичная куча".
 * Основная идея - в поиске максимального элемента в неотсортированной части массива и его перемещении в конец этого подмассива.
 * <p>
 * Сложность: в любом случае - O(n*log(n)).
 */
public class HeapSort implements BaseSort {

    @Override
    public void sort(List<Integer> list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);
            heapify(list, i, 0);
        }
    }


    private void heapify(List<Integer> list, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && list.get(l) > list.get(largest)) {
            largest = l;
        }
        if (r < n && list.get(r) > list.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);
            heapify(list, n, largest);
        }
    }
}
