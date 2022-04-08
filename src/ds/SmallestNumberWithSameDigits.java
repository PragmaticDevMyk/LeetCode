package ds;

public class SmallestNumberWithSameDigits {

    public int solution(int N) {
        int smallestNumber = 0;

        if (N <= 1 || String.valueOf(N).length() == 1) {
            return smallestNumber;
        }

        int numberOfDigits = String.valueOf(N).length();

        return (int) Math.pow(10, numberOfDigits-1);
    }
}
