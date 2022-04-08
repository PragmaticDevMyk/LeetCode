package ds;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {
        List<Student> names = Arrays.asList(
                new Student(1,"John", 56.0),
                new Student(2,"John", 86.0),
                new Student(3, "Heinz", 72.0),
                new Student(3, "Anton", 56.0));
        //names.sort(null); //alphabetical ordering

        names.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int result = student1.getName().compareTo(student2.getName());
                return result != 0 ? result : Integer.compare(student1.getYear(), student2.getYear());
            }
        });
        System.out.println(names);

        //By Grades Best First

        //        Comparator<Student> c = Comparator.<Student>comparingDouble((student) -> student.getAverage())
//                .thenComparing(student -> student.getName())
//                .thenComparingInt(student -> student.getYear());

        //SAME AS

        Comparator<Student> c = Comparator.comparingDouble(Student::getAverage)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getYear);
        System.out.println(names);

        //OR

//        names.sort((student1, student2) -> {
//            int result = Double.compare(student1.getAverage(), student2.getAverage());
//            if (result == 0) {
//                result = student1.getName().compareTo(student2.getName());
//            }
//            if (result == 0) {
//                result = Integer.compare(student1.getYear(), student2.getYear());
//            }
//            return result;
//        });


        List<Integer> numbers = fillWithLotsOfRandomValues();
        for (int i = 0; i < 10; i++) {
            testSortingSpeed(numbers);
        }
    }

    private static void testSortingSpeed(List<Integer> numbers) {
        List<Integer> arrayList = new ArrayList<>(numbers);
        List<Integer> linkedList = new LinkedList<>(numbers);
        List<Integer> cowList = new CopyOnWriteArrayList<>(numbers);
        List<Integer> parallelSortingArrayList = new parallelSortedArrayList<>(numbers);
        sortList(arrayList);
        sortList(linkedList);
        sortList(cowList);
        sortList(parallelSortingArrayList);

        System.out.println("Already Sorted");
        for (int i = 0; i < 5; i++) {
            sortList(arrayList);
            sortList(linkedList);
            sortList(cowList);
            sortList(parallelSortingArrayList);
        }
    }

    private static void sortList(List<Integer> list) {
        long time = System.currentTimeMillis();
        list.sort(null);
        time = System.currentTimeMillis() - time;
        System.out.println(list.getClass().getSimpleName() + " time = " + time);
    }

    private static List<Integer> fillWithLotsOfRandomValues() {
        return ThreadLocalRandom.current().ints(10_000_000).parallel().boxed()
                .collect(Collectors.toList());
    }
}
