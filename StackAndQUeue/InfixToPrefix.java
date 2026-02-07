import java.util.Stack;
import java.util.*;
public class InfixToPrefix {
      public static void main(String[] args) {
          String s = "(A+B)*C-D+F";
          String Answer = infixToPrefix(s);
          System.out.println(Answer);
      }
       public static int getPriority(char C) {
        if (C == '^')  // Exponent operator has highest precedence
            return 3;
        else if (C == '*' || C == '/')  // Multiplication and division have higher precedence than addition
            return 2;
        else if (C == '+' || C == '-')  // Addition and subtraction have lowest precedence
            return 1;
        return 0;
    }
      static String infixToPostfix(String infix){
          Stack<Character>st = new Stack<>();
          StringBuilder result = new StringBuilder();
          infix = "(" + infix + ")";
          for(int i=0; i<infix.length(); i++ ){
            char c = infix.charAt(i);
              if(Character.isLetterOrDigit(c)){
                 result.append(c);
              }
              else if(c == '('){
                   st.push('(');
              }
              else if(c == ')'){
                 while(st.peek() != '('){
                     result.append(st.pop());
                 }
                 st.pop();
              }
              else{
                 while(!st.empty() && (getPriority(c) <= getPriority(st.peek()) )){
                       result.append(st.pop());
                 }
                 st.push(c);
              }
          }
          while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
      }
   static String infixToPrefix(String  infix){
       StringBuilder sb = new StringBuilder(infix);
       sb.reverse();
       for(int i=0; i< sb.length(); i++){
           if(sb.charAt(i) == '('){
             sb.setCharAt(i,')');
           }
           else if(sb.charAt(i) == ')'){
             sb.setCharAt(i,'(');
           }
       }
       String prefix = infixToPostfix(sb.toString());
       return new StringBuilder(prefix).reverse().toString();
   }
}
