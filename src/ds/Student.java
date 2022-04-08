package ds;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private final int year;
    private final String name;
    private final double average;

    public Student(int year, String name, double average) {
        this.year = year;
        this.name = name;
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }

    public int compareTo(Student student) {
//            int result =  year - student.year;
        int result = Integer.compare(year, student.year);
        return result != 0 ? result : name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student " + name + " From year " + year +
                " had an average of " + average + "%";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getAverage() {
        return average;
    }
}
