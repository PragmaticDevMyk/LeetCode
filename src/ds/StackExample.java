package ds;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); //ConcurrentLinkedDeque
        //add and push is one and the same thing
        stack.add("Tomatoes");
        stack.add("Carrots");
        stack.push("Cucumbers");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
