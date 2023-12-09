package structure;

import java.util.LinkedList;

/**
 * Стек.
 * <p>
 * Можно добавлять элементы в конец стека и удалять только элемент из конца стека.
 */
public class Stack implements BaseStructure {

    // связанные список, которые хранит все элементы
    private final LinkedList<Integer> list = new LinkedList<>();

    // функция добавления элемента в конец стека
    public void enqueue(Integer element) {
        list.addLast(element);
    }

    // функция удаления элемента из конца стека
    @SuppressWarnings("unused")
    public Integer dequeue() {
        return list.pollLast();
    }

    // функция, которая преобразовывает структуру в строку для вывода на экран
    @Override
    public String toString() {
        return list.toString();
    }

    // функция, которая возвращает количество элементов
    // для определения размера структуры при сортировке
    @Override
    public int size() {
        return list.size();
    }

    // возвращает элемент по индексу
    @Override
    public Integer get(int index) {
        return list.get(index);
    }

    // находит элемент по указанному индексу и задает ему переданное значение
    @Override
    public void set(int index, Integer value) {
        list.set(index, value);
    }

    // находит два элемента по указанным индексам и меняет их значения местами
    @Override
    public void swap(Integer index1, Integer index2) {
        Integer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
