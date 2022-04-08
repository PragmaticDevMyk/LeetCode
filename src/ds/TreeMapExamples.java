package ds;

import java.util.*;

public class TreeMapExamples {
    private static class Person implements Comparable<Person> {
        private final String name;
        private final int day;
        private final int month;
        private final int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public int hashCode() {
            return (name.hashCode() << 16) ^ (day << 12) ^ (month << 8) ^ year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return day == person.day && month == person.month && year == person.year && Objects.equals(name, person.name);
        }

        @Override
        public int compareTo(Person person) {
            return NATURAL_ORDER.compare(this, person);
        }

        public static final Comparator<Person> NATURAL_ORDER =
                Comparator.<Person, String>comparing(p -> p.name)
                        .thenComparingInt(p -> p.year)
                        .thenComparingInt(p -> p.month)
                        .thenComparingInt(p -> p.day);
    }
    public static void main(String[] args) {
        // 1.2 born - % remainder slow, but good distribution
        // 1.4 & bitmask fast, but can be bad distribution
        // tree if too many clashes

//        Map<String, Integer> numbers = new TreeMap<>(
//                Map.of("one", 1, "two", 2, "sixteen", 16, "unlucky", 13)
//        );
//        System.out.println("numbers = " + numbers);

//        HashMap<String, Integer> numbers1 = new HashMap<>(
//                Map.ofEntries(Map.entry("one", 1), Map.entry("two", 2) , Map.entry("sixteen", 16))
//        );



        Map<String, Integer> numbers = new TreeMap<>(
                Comparator.comparingInt(String::length));
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("sixteen", 16);
        numbers.put("unlucky", 13);
//        numbers.putAll(Map.of("one", 1, "two", 2, "sixteen", 16, "unlucky", 13));
        System.out.println("numbers = " + numbers);

        Map<String, List<Integer>> superstition = new TreeMap<>();
        add(superstition, "unlucky", 13);
        add(superstition, "unlucky", 7);
        add(superstition, "unlucky", 3);
        add(superstition, "lucky", 65);
        add(superstition, "lucky", 60);
        add(superstition, "lucky", 5);

        superstition.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    private static void add(Map<String, List<Integer>> superstition, String key, int number) {

        superstition.computeIfAbsent(key, k -> new ArrayList<>()).add(number);
    }
}
