package sorting;

import java.util.HashMap;
import java.util.List;

public interface BaseSort {
    /**
     * Сортировка массива или списка.
     *
     * @param list массив или список
     */
    void sort(List<Integer> list);

    /**
     * Сортировка словаря.
     *
     * @param map словарь
     */
    void sort(HashMap<Integer, Integer> map);
}
