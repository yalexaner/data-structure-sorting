package generator;

import java.util.ArrayList;
import java.util.Random;

public class ArrayGenerator implements BaseGenerator {

    @Override
    public ArrayList<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>(elementsAmount);
        for (int i = 0; i < elementsAmount; i++) {
            array.add(1 + rand.nextInt(elementsAmount));
        }
        return array;
    }
}
