import generator.ArrayGenerator;
import generator.ListGenerator;
import sorting.*;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            System.out.print("Выберите структуру данных (1 - массив, 2 - список, ENTER - выйти): ");

            int input;
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
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
                ArrayGenerator arrayGenerator = new ArrayGenerator();
                ArrayList<Integer> array = arrayGenerator.generate(elementsAmount);
                sortCollection(array);
            } else if (input == 2) {
                ListGenerator listGenerator = new ListGenerator();
                List<Integer> list = listGenerator.generate(elementsAmount);
                sortCollection(list);
            } else {
                break;
            }

            System.out.println("\nНажмите ENTER для продолжения...");
            scanner.nextLine();
            System.out.println();
        }
    }

    private static void sortCollection(List<Integer> collection) {
        for (BaseSort algorithm : sortingAlgorithms) {
            Instant start = Instant.now();

            System.out.println("Сортировка с помощью алгоритма " + algorithm.getClass().getSimpleName());
            algorithm.sort(collection);

            Instant end = Instant.now();
            System.out.println("Сортировка заняла " + Duration.between(start, end).toMillis() + " ms");
        }
    }
}
