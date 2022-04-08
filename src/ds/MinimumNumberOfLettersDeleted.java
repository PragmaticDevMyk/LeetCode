package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberOfLettersDeleted {

    public int solution (String S) {

       Integer [] charCount = new Integer[26];
        Arrays.fill(charCount, 0);

        for (int i = 0; i < S.length(); i++) {
             int index = S.charAt(i) - 'a';
             int count = charCount[index];
             charCount[index] = count + 1;
        }

        //create list of counts

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                list.add(charCount[i]);
            }
        }
        //sort the list

        Collections.sort(list, Collections.reverseOrder());

        Integer[] counts = list.toArray(new Integer[list.size()]);

        int deletions = 0;
        //iterate from left to right
        //if count is the same then reduce

        for (int i = 0; i< counts.length-1; i++) {
            for (int j = i + 1; j < counts.length; j++) {
                if (counts[i] > 0 && counts[i] == counts[j]) {

                    int count = counts[j];
                    counts[j] = count - 1;
                    deletions++;
                } else {
                    break;
                }
            }
        }
        return deletions;
    }
}
