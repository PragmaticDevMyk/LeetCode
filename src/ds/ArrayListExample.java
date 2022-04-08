package ds;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Autumn");
        seasons.add("Winter");

        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));

        seasons.remove("Summer");
        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));

        System.out.println("seasons.contains(\"Summer\") = " + seasons.contains("Summer"));

        for (int i = 0; i < 10_000; i++) {

            seasons.add("Pretty Warm");
            
        }
        System.out.println(seasons);
        seasons.removeIf(season -> season.equals("Pretty Warm"));

        System.out.println("Seasons = " + seasons);

        seasons.trimToSize(); // don't use it a lot // it's a premature optimization

        seasons.clear();

        new ArrayList<>();

    }
}
