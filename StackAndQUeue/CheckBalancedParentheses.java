import java.util.*;
class CheckBalancedParentheses{
    public static void main(String[] args) {
        String ch = "( ) { } ";
        boolean Answer =  checkBalancedParenthses(ch);
         ch = ch.replace(" ", "");
        System.out.println(Answer);
    }
    static boolean openingCharacters(char c,HashMap<Character,Integer> s1){
        for(int i=0; i<s1.size(); i++){
              if(s1.containsKey(c)){
                 return true;
              }
        }
            return false;
         }
         static boolean closingCharacters(char c,HashMap<Character,Integer> s2){
               for(int j=0; j<s2.size(); j++){
                  if(s2.containsKey(c)){
                     return true;
                  }
               }
               return false;
         }
     static boolean checkBalancedParenthses(String ch){
         HashMap<Character,Integer> s1 = new HashMap<>();
           s1.put('(',0);
         s1.put('[',1);
         s1.put('{',2);
         HashMap<Character,Integer> s2 = new HashMap<>();
         s2.put(')',0);
         s2.put(']',1);
         s2.put('}',2); 
       Stack<Character>stack = new Stack<>();
        for(int i=0; i<ch.length(); i++){
          char current = ch.charAt(i);
            if(openingCharacters(current,s1)){
               stack.push(current);
            }
            else if(closingCharacters(current,s2)){
             if(stack.isEmpty()){
                 return false;
            }
            char lastOpen = stack.pop();
            if(!s1.get(lastOpen).equals(s2.get(current))){
                return false;
            }
            }
        }
        return stack.isEmpty();
    }
}
 

