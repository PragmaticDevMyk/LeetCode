package ds;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class HashTableExamples {
    public static class Person{
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(final Object o) {
            if (!(o instanceof Person)) return false;
            System.out.println("equals(" + ((Person)o).name + ")");
            return name.equals(((Person)o).name);
        }


    }

    public static void main(String[] args) {
//        Map<Integer, Long> squares  = new Hashtable<>();
//        IntStream.range(0, 10_000_000).parallel()
//                .forEach(i -> squares.put(i, ((long)i) * i));
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(IntStream.range(0, 10_000_000).parallel()
//                    .mapToLong(squares::get).sum());
//        }


        Map<Person, Object> map = new Hashtable<>();
        map.put(new Person("Heinz"), "dummy");
        System.out.println(map);
        System.out.println(map.get(new Person("John")));
    }
}
