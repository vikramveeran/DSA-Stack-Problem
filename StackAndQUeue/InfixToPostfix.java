import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
         String s = "(a + b) * c";
     s.replace(" ","");
     String Ans = infixTOPostfix(s);
   
            System.out.println(Ans );
    }
    static String infixTOPostfix(String s){
         String Alp = "";
        String opp = "";
        String Answer = "";
       ArrayList<Character>ch1 = new ArrayList<>();
        ArrayList<Character>ch2 = new ArrayList<>();
       for(int i=0; i<s.length(); i++){
             if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                 ch1.add(s.charAt(i));
             }
            else if(s.charAt(i) == ')'){
                 for(int j=0; j<ch1.size(); j++){
                        Answer += ch1.get(j);
                  } 
               for(int j=0; j<ch2.size(); j++){
                         Answer += ch2.get(j);
                  }
                  ch1.clear();
                  ch2.clear();
             }
             else{
                 ch2.add(s.charAt(i));
             }
       }
     for(int i=0; i<ch1.size(); i++){
          Alp += ch1.get(i);
     }
     for(int i=0; i<ch2.size(); i++){
         opp += ch2.get(i);
     }
     Answer = Alp+opp;
     return Answer;
    }
}

