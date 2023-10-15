package generator;

import java.util.LinkedList;
import java.util.Random;

public class ListGenerator implements BaseGenerator {

    @Override
    public LinkedList<Integer> generate(int elementsAmount) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < elementsAmount; i++) {
            list.add(1 + rand.nextInt(elementsAmount));
        }
        return list;
    }
}
