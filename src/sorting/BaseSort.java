package sorting;

import structure.BaseStructure;

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

    /**
     * Сортировка очереди или стека.
     *
     * @param structure очередь или стек
     */
    void sort(BaseStructure structure);
}
