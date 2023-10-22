package sorting;

import java.util.HashMap;
import java.util.List;

/**
 * Сортировка слиянием.
 * <p>
 * Эффективный алгоритм сортировки, основанный на принципе "разделяй и властвуй".
 * Он разбивает исходный массив на две примерно равные части, затем каждая из этих частей сортируется отдельно тем же алгоритмом,
 * после чего два упорядоченных массива половинного размера соединяются в один.
 * <p>
 * Рекурсивное разбиение задачи на меньшие происходит до тех пор, пока размер массива не достигнет единицы.
 * Соединение двух упорядоченных массивов в один происходит путем слияния двух подмассивов в третий результирующий массив.
 * <p>
 * Сложность: в любом случае - O(n*log(n)).
 */
public class MergeSort implements BaseSort {

    @Override
    public void sort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    private void sort(List<Integer> list, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(list, l, m);
            sort(list, m + 1, r);
            merge(list, l, m, r);
        }
    }

    private void merge(List<Integer> list, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = list.get(l + i);
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = list.get(m + 1 + j);
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list.set(k, L[i]);
                i++;
            } else {
                list.set(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            list.set(k, L[i]);
            i++;
            k++;
        }
        while (j < n2) {
            list.set(k, R[j]);
            j++;
            k++;
        }
    }

    @Override
    public void sort(HashMap<Integer, Integer> map) {
        sort(map, 0, map.size() - 1);
    }

    private void sort(HashMap<Integer, Integer> map, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(map, l, m);
            sort(map, m + 1, r);
            merge(map, l, m, r);
        }
    }

    private void merge(HashMap<Integer, Integer> map, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = map.get(l + i);
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = map.get(m + 1 + j);
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                map.put(k, L[i]);
                i++;
            } else {
                map.put(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            map.put(k, L[i]);
            i++;
            k++;
        }
        while (j < n2) {
            map.put(k, R[j]);
            j++;
            k++;
        }
    }
}
