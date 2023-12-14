import java.util.Scanner;
import java.util.Stack;

public class CloseBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < t; i++) {
            String expression = in.nextLine();
            String result = isBalanced(expression);
            System.out.println(result);
        }
    }

    private static String isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
