package ds;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
//        Set<Integer> set = Set.of(1,2,3);
        Set<String> oddBelowTwenty = new HashSet<>();
        oddBelowTwenty.add("1");
        oddBelowTwenty.add("3");
        oddBelowTwenty.add("5");
        oddBelowTwenty.add("7");
        oddBelowTwenty.add("9");
        oddBelowTwenty.add("11");
        oddBelowTwenty.add("13");
        oddBelowTwenty.add("15");
        oddBelowTwenty.add("17");
        oddBelowTwenty.add("19");
        System.out.println("Odd below twenty = " + oddBelowTwenty);

        Student s1 = new Student(1, "Peter", 33);
        Student s2 = new Student(1, "Peter", 98);
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("students = " + students);

        int x = 1024;
        int y = 768;
        System.out.println("(x * y) = " + (x * y));

        Set<Integer> uniqueHashCodes = new HashSet<>();
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                uniqueHashCodes.add(new Pixel(i, j).hashCode());
            }
        }

        System.out.println("uniqueHashCodes.size() = " + uniqueHashCodes.size());



//        Set<String> evenBelowTen = new HashSet<>();
//        evenBelowTen.add("0");
//        evenBelowTen.add("2");
//        evenBelowTen.add("4");
//        evenBelowTen.add("6");
//        evenBelowTen.add("8");
//        System.out.println("Even below ten = " + evenBelowTen);
//
//        Set<String> numbersBelowTen = new HashSet<>(oddBelowTwenty);
//        numbersBelowTen.addAll(evenBelowTen);  //union
//
//        System.out.println("Numbers below Ten = " + numbersBelowTen);
//
//
//        Set<String> primesBelowTen = new HashSet<>();
//        primesBelowTen.add("2");
//        primesBelowTen.add("3");
//        primesBelowTen.add("5");
//        primesBelowTen.add("7");
//
//        System.out.println("Primes below ten = " + primesBelowTen);
//
//        Set<String> intersectionPrimesAndEven = new HashSet<>(primesBelowTen);
//        intersectionPrimesAndEven.retainAll(evenBelowTen);
//        System.out.println("Intersection Primes and Even  = " + intersectionPrimesAndEven);
//
//
//        Set<String> primesLessOdds = new HashSet<>(primesBelowTen);
//        primesLessOdds.removeAll(oddBelowTwenty);
//        System.out.println("Prime Less Odds below ten = " + primesLessOdds);
    }
}
