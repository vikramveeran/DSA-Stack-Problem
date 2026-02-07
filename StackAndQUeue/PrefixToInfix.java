import java.util.*;

public class PrefixToInfix {
    public static void main(String[] args) {
         String prefix = "*-A/BC-/AKL";
         String Answer  = infixToPrefix(prefix);
         System.out.println(Answer);
    }
    static String infixToPrefix(String prefix){
           Stack<String>s = new Stack<>();

           for(int i=prefix.length()-1; i>=0; i--){
            char c = prefix.charAt(i);
               if(Character.isLetterOrDigit(c)){
                  s.push(String.valueOf(c));
               }
               else{
                 String operand1 = s.pop();
                 String operand2 = s.pop();

                 s.push("(" + operand1 + c + operand2 + ")");
               }
           }
           return s.peek();
    }
}




