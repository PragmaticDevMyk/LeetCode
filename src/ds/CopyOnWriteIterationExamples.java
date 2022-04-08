package ds;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIterationExamples {

    public static void main(String[] args) {
        List<String> names = new CopyOnWriteArrayList<>(
                Arrays.asList("John", "Heinz", "Anton"));

//        names.sort(null);

        //OR

        Collections.sort(names);

        System.out.println("Names = " + names);
        for (Iterator<String> it = names.iterator(); it.hasNext(); ) {
            String name =  it.next();
            System.out.println("Checking: " + name);
            if (name.contains("o")) names.remove(name);
        }
//        names.forEach(name -> {
//            System.out.println("Checking: " + name);
//            if (name.contains("o")) names.remove(name);
//        });

        System.out.println("Names = " + names);
    }
}
