import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s =  "abc*+d-";
        String Answer = postfixToPrefix(s);
        System.out.println(Answer);
    }
    static String postfixToPrefix(String s){
           Stack<String> st = new Stack<>();
           for(int i=0; i<s.length(); i++){
                 char ch = s.charAt(i);
                 if(Character.isLetterOrDigit(ch)){
                     st.push(String.valueOf(ch));
                 }
                 else{
                
                     String opp2 = st.pop();
                     String opp1 = st.pop();

                     st.push(ch + opp1 + opp2);
                 }
           }
           return st.peek();
    }
}


