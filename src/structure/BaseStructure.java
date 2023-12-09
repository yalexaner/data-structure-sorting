package structure;

/**
 * Базовая структура, от которой реализуются Стек и Очередь.
 */
public interface BaseStructure {

    // возвращает размер структуры
    int size();

    // возвращает элемент по индексу
    Integer get(int index);

    // устанавливает значение по индексу
    void set(int index, Integer value);

    // меняет местами элементы по индексам
    void swap(Integer index1, Integer index2);
}