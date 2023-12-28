import generator.*;
import sorting.*;
import structure.BaseStructure;
import structure.Queue;
import structure.Stack;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Main {

    private static final BaseSort[] sortingAlgorithms = {
            new BubbleSort(),
            new SelectionSort(),
            new InsertionSort(),
            new HeapSort(),
            new MergeSort(),
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите структуру данных (1 - массив, 2 - список, 3 - словарь, 4 - очередь, 5 - стек, ENTER - выйти): ");

            int input;
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                break;
            }

            if (input < 1 || input > 5) {
                break;
            }

            System.out.print("Введите количество элементов: ");

            int elementsAmount;
            try {
                elementsAmount = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                break;
            }

            System.out.println();

            if (input == 1) {
                ArrayList<Integer> array = ArrayGenerator.generate(elementsAmount);
                sort(array);
            } else if (input == 2) {
                List<Integer> list = ListGenerator.generate(elementsAmount);
                sort(list);
            } else if (input == 3) {
                HashMap<Integer, Integer> map = MapGenerator.generate(elementsAmount);
                sort(map);
            } else if (input == 4) {
                Queue queue = QueueGenerator.generate(elementsAmount);
                sort(queue);
            } else if (input == 5) {
                Stack stack = StackGenerator.generate(elementsAmount);
                sort(stack);
            } else {
                break;
            }

            System.out.println("\nНажмите ENTER для продолжения...");
            scanner.nextLine();
            System.out.println();
        }
    }

    private static void sort(List<Integer> collection) {
        for (BaseSort algorithm : sortingAlgorithms) {
            if (collection instanceof ArrayList<Integer>) {
                sortCollection(new ArrayList<>(collection), algorithm);
            } else {
                sortCollection(new LinkedList<>(collection), algorithm);
            }
        }
    }

    private static void sortCollection(List<Integer> collection, BaseSort algorithm) {
        System.out.println("Сортировка с помощью алгоритма " + algorithm.getClass().getSimpleName());

        Instant start = Instant.now();
        algorithm.sort(collection);
        Instant end = Instant.now();

        System.out.println("Сортировка заняла " + Duration.between(start, end).toMillis() / 1000f + " секунд");
    }

    private static void sort(HashMap<Integer, Integer> collection) {
        for (BaseSort algorithm : sortingAlgorithms) {
            sortCollection(new HashMap<>(collection), algorithm);
        }
    }

    private static void sortCollection(HashMap<Integer, Integer> map, BaseSort algorithm) {
        System.out.println("Сортировка с помощью алгоритма " + algorithm.getClass().getSimpleName());

        Instant start = Instant.now();
        algorithm.sort(map);
        Instant end = Instant.now();

        System.out.println("Сортировка заняла " + Duration.between(start, end).toMillis() / 1000f + " секунд");
    }

    private static void sort(BaseStructure collection) {
        for (BaseSort algorithm : sortingAlgorithms) {
            sortCollection(collection.copy(), algorithm);
        }
    }

    private static void sortCollection(BaseStructure collection, BaseSort algorithm) {
        System.out.println("Сортировка с помощью алгоритма " + algorithm.getClass().getSimpleName());

        Instant start = Instant.now();
        algorithm.sort(collection);
        Instant end = Instant.now();

        System.out.println("Сортировка заняла " + Duration.between(start, end).toMillis() / 1000f + " секунд");
    }
}
