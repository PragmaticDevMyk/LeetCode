package ds;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzbuzz(int N){

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= N; i++){

            if (i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if (i % 3 == 0){
                list.add("Fizz");
            }else if (i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
    public static void main(String [] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int N = 15;
    }

}

