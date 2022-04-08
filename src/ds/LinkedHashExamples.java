package ds;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashExamples {

    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(0);

        System.out.println("numbers = " + numbers);


        LinkedHashMap<Integer, Integer> squares =
                new LinkedHashMap<>(16, 0.75f, true);

        squares.put(1,1);
        squares.put(3,9);
        squares.put(12,144);
        squares.put(15,225);
        squares.put(16,256);

        System.out.println("squares = " + squares);

        System.out.println("squares.get(12) = " + squares.get(12));

        System.out.println("squares = " + squares);


        LinkedHashMap<Integer, Integer> lrusquares = new LinkedHashMap<>(16, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {

                return size() > 5;
//                return super.removeEldestEntry(eldest);
            }
        };

        for (int i = 0; i < 6; i++) {

            lrusquares.put(i, i*i);
        }
        System.out.println("lrusquares = " + lrusquares);

        System.out.println("lrusquares.get(4) = " + lrusquares.get(4));
        System.out.println("lrusquares = " + lrusquares);


        for (int i = 10; i < 15; i++) {

            lrusquares.put(i, i*i);
        }
        System.out.println("lrusquares = " + lrusquares);
    }
}
