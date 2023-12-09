package sorting;

import structure.BaseStructure;

import java.util.HashMap;
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

    @Override
    public void sort(HashMap<Integer, Integer> map) {
        int n = map.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(map, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = map.get(0);
            map.put(0, map.get(i));
            map.put(i, temp);
            heapify(map, i, 0);
        }
    }

    private void heapify(HashMap<Integer, Integer> map, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && map.get(l) > map.get(largest)) {
            largest = l;
        }
        if (r < n && map.get(r) > map.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int swap = map.get(i);
            map.put(i, map.get(largest));
            map.put(largest, swap);
            heapify(map, n, largest);
        }
    }

    @Override
    public void sort(BaseStructure structure) {
        int n = structure.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(structure, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            structure.swap(0, i);
            heapify(structure, i, 0);
        }
    }

    private void heapify(BaseStructure structure, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && structure.get(l) > structure.get(largest)) {
            largest = l;
        }
        if (r < n && structure.get(r) > structure.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            structure.swap(i, largest);
            heapify(structure, n, largest);
        }
    }
}
