import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        String infixToPostfix = infixTOPostfix(s);
        System.out.println(infixToPostfix);
    }

    static int expresionPriority(char ch){
          if(ch == '+' || ch == '-'){
             return 1;
          }
         else if(ch == '/' || ch == '*'){
             return 2;
          }
          else if(ch == '^'){
             return 1;
          }
          return 0;
    }   
     static String infixTOPostfix(String s){
         Stack<Character>st = new Stack<>();
         StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
             char ch = s.charAt(i);
             if(ch == '('){
                 st.push(ch);
             }
            else if(Character.isLetterOrDigit(ch)){
                 result.append(ch);
             }
             else if(ch == ')'){
                  while(st.peek() != '('){
                     result.append(st.pop());
                 }
                 st.pop();
             }
             else{
                 while(!st.isEmpty() && expresionPriority(st.peek()) > expresionPriority(ch) ){
                     result.append(st.pop());
                 }
                 st.push(ch);
             }
   
        }
        while(!st.empty()){
             result.append(st.pop());
        }
        return result.toString();
    }
}


