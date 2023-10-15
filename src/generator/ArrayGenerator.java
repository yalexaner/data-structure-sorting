package generator;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateArray(int elements) {
        Random rand = new Random();
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + rand.nextInt(elements);
        }
        return array;
    }
}
