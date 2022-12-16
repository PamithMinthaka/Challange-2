package SlassCom;

import java.util.*;


public class BalancedBrackets 
{
    public static void main(String[] args) 
    {
        String s = "([{}])";

        //call the method
        if (BracketsBalanced(s))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
    
    static boolean BracketsBalanced(String expr)
    {
        
        Stack<Character> s = new Stack<Character>();
 
        // push in on to the stack.
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                
                s.push(x);
                continue;
            }
 
           
            if (s.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = s.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = s.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = s.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        
        return (s.isEmpty());
    }
}
