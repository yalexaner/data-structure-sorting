package generator;

import java.util.Random;

public class ArrayGenerator {

    private static final int ELEMENTS_AMOUNT = 10_000;

    public static int[] generateArray() {
        Random rand = new Random();
        int[] array = new int[ELEMENTS_AMOUNT];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + rand.nextInt(ELEMENTS_AMOUNT);
        }
        return array;
    }
}
