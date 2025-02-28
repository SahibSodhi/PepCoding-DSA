import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String characters = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < characters.length(); i++) {
            char ch = characters.charAt(i);

            if (ch == ')') {
                if (stack.peek() == '(') {
                    System.out.println(true);
                    scanner.close();//Prevent resource leak in this case; alternative is to use try with resources
                    return;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        System.out.println(false);

        scanner.close();

    }
}
