package ds;

public class HashingExample {
    public static void main(String[] args) {

        BasicHashTable<Integer, String> numbers = new BasicHashTable<>();
        numbers.put(1,"One");
        numbers.put(2, "Two");
        numbers.put(42,"THE number"); //hash = 42
        numbers.put(243, "two-four-three");
        numbers.put(244, "two-four-four"); //hash = 242 % 101 = 42


        System.out.println("numbers = " + numbers);
    }
}
