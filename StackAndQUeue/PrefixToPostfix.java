import java.util.Stack;
import java.util.*;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String s ="*+ab-cd";
        String Answer = prefixToPostfix(s);
        System.out.println(Answer);
    }
    // public static int getPriority(char C) {
    //     if (C == '^')  // Exponent operator has highest precedence
    //         return 3;
    //     else if (C == '*' || C == '/')  // Multiplication and division have higher precedence than addition
    //         return 2;
    //     else if (C == '+' || C == '-')  // Addition and subtraction have lowest precedence
    //         return 1;
    //     return 0;
    // }
    static String prefixToPostfix(String s){
          Stack<String>st = new Stack<>();
          int n = s.length();
          for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
                if(Character.isLetterOrDigit(ch)){
                      st.push(String.valueOf(ch));
                }
                else{
                     String opp1 = st.pop();
                     String opp2  = st.pop();

                     st.push(opp1 + opp2 + ch);
                }
            }
            return  st.peek();     
    }
}
