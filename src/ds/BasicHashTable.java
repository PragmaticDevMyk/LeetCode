package ds;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicHashTable<K, V> {
//    private final Object[] values = new Object[101];
    private final Object[] values = new Object[128];

    public void put(K key, V value) {

        values[calculatePosition(key)] = value;
    }

    public V get(K key) {
        int position = calculatePosition(key);
        return (V) values[position];
    }

    private int calculatePosition(K key) {
        int hash = key.hashCode();
//        int position = hash % values.length;
        int position = hash & 127;

        if (position < 0) position += values.length;
        return position;
    }

    @Override
    public String toString() {
        return Stream.of(values).filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(", ", "{", "}"));

    }
}
