package ds;

import java.util.*;

public class IterationExamples {
    public static void main(String[] args) {
//        Vector<String> names = new Vector<>(
//                Arrays.asList("John", "Heinz", "Anton"));
//        Enumeration<String> enumeration = names.elements();
//        while (enumeration.hasMoreElements()) {
//            String name = enumeration.nextElement();
//            if (name.contains("o")) {
//                names.remove(name);
//            }
//        }

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("John", "Heinz", "Anton"));
        names.forEach(name -> {
            if (name.contains("o")) names.remove(name);
        });


//        for (String name : names) {
//
//            if (name.contains("o")) {
//                names.remove(name);
//            }
//        }
        
//        Iterator<String> enumeration = names.iterator();
//        while (enumeration.hasNext()) {
//            String name = enumeration.next();
//            if (name.contains("o")) {
//                names.remove(name);
//            }
//        }
        System.out.println("Names = " + names);
        names.listIterator(); //check Erich Gamma et al - Design Patterns
    }
}
