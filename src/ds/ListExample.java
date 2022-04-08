package ds;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class ListExample {

    public static void main (String [] args) {
//        List<String> names = Arrays.asList("John", "Anton", "Heinz");
        List<String> names = List.of("John", "Anton", "Heinz"); //JAVA 9 immutable-cannot change at all

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names);

        //RandomAccess randomAccess;

//        names.set(1, "Antony");
//        System.out.println(names);

//        names.add("Dirk");
//        names.clear();
    }
}
