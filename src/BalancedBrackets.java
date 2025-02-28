import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner (System.in);
        String characters = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < characters.length(); i++){
            char ch = characters.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                boolean val = handleClosingBrackets(stack, '(');
                if(val == false){
                    System.out.println(false);
                    scanner.close();
                    return;
                }
            }
            else if(ch == '}'){
                boolean val = handleClosingBrackets(stack, '{');
                if(val == false){
                    System.out.println(false);
                    scanner.close();
                    return;
                }
            }
            else if (ch == ']'){
                boolean val = handleClosingBrackets(stack, '[');
                if(val == false){
                    System.out.println(false);
                    scanner.close();
                    return;
                }
            }
        }

        if(stack.isEmpty()){
            System.out.println(true);
        }
        else{ //Opening brackets are more than closing brackets
            System.out.println(false);
        }

        scanner.close();

    }

    public static boolean handleClosingBrackets(Stack<Character> stack, char correspondingOpeningBracket){
        if(stack.isEmpty()){ //Closing brackets are more than opening brackets
            return false;
        }
        else if(stack.peek() != correspondingOpeningBracket){ // Bracket mismatch
            return false;
        }
        else{
            stack.pop();
            return true;
        }
    }
}
