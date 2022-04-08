package ds;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.IntStream;

public class ConcurrentSkipListMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> squares = new ConcurrentSkipListMap<>();
        IntStream.range(0, 10_000).parallel().forEach(
                i -> squares.put(i , i*i)
        );
        System.out.println("squares = " + squares);
        System.out.println("squares.size() = " + squares.size());
    }
}
