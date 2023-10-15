import generator.ArrayGenerator;
import sorting.*;

import java.time.Duration;
import java.time.Instant;

public class Main {

    private static final int ELEMENTS_AMOUNT = 50_000;

    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(ELEMENTS_AMOUNT);

        BaseSort[] sortingAlgorithms = {
                new BubbleSort(),
                new SelectionSort(),
                new InsertionSort(),
                new HeapSort(),
                new MergeSort(),
        };

        for (BaseSort algorithm : sortingAlgorithms) {
            int[] arrayCopy = array.clone();
            Instant start = Instant.now();

            System.out.println("Сортировка с помощью алгоритма " + algorithm.getClass().getSimpleName());
            algorithm.sort(arrayCopy);

            Instant end = Instant.now();
            System.out.println("Сортировка заняла " + Duration.between(start, end).toMillis() + " ms\n");
        }
    }
}