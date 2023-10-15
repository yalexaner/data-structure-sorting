package sorting;

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

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
