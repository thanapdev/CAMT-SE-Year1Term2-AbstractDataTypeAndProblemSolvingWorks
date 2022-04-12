//Name : Thanapong Yamkamol
//ID : 642115022

import java.io.*;
import java.util.Scanner;

public class ifTopf {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 1;

        File file = new File(args[0]);

        Scanner myScan = new Scanner(file);

        while (myScan.hasNext()) {
            String exp = myScan.nextLine();
            if (!exp.equals("")) {
                System.out.println("Expression " + i + ": ");
                System.out.println("Infix exp: " + exp);
                System.out.println("Postfix exp: " + infixToPostfix(exp));
                System.out.println();
                i++;
            }
        }

        myScan.close();
    }

    public static int Precedence(char ch){
        if(ch == '^')
            return 3;
        if(ch == '*' || ch == '/')
            return 2;
        if(ch == '+' || ch == '-')
            return 1;
        return -1;
    }

    static String infixToPostfix(String exp)
    {
        String result = "";

        stack<Character> stack = new stack<>();
         
        for (int i = 0; i < exp.length(); ++i)
        {
            char character = exp.charAt(i);

            // If operand add to output.
            if (Character.isLetterOrDigit(character))
                result += character;

            // If '(' push it to the stack.
            else if (character == '(')
                stack.push(character);
             
            // If ')' pop and output from the stack
            else if (character == ')')
            {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();
                 
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Precedence(character)
                         <= Precedence(stack.peek())){
                   
                    result += stack.pop();
             }
                stack.push(character);
            }
      
        }
      
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
         }
        return result;
    }
}
