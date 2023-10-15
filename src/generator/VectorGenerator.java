package generator;

import java.util.Random;
import java.util.Vector;

public class VectorGenerator implements BaseGenerator {

    @Override
    public Vector<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        Vector<Integer> list = new Vector<>();
        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }
        return list;
    }
}
