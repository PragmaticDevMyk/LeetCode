package ds;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {

        Set<Integer> oddBetweenMinusTenToTen = new CopyOnWriteArraySet<>();
        oddBetweenMinusTenToTen.addAll(
                Arrays.asList(-9, -7, -5, 5, -1, -3, 3, 1, 1, 1, 9, 7));
        System.out.println("oddBetweenMinusTenToTen = " + oddBetweenMinusTenToTen);

        Student s1 = new Student(1, "Peter", 33);
        Student s2 = new Student(1, "Peter", 98);
        Set<Student> students = new CopyOnWriteArraySet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("students = " + students);
    }
}
