package SlidingWindow;
import java.util.*;
public class LengthOfLongestSubstringKDistinct {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int result = lengthOfLongestSubstringKDistinct(s,k);
        System.out.println(result);
    }
    // optimal Approch
   static int lengthOfLongestSubstringKDistinct(String s,int k){
         Map<Character,Integer>freq = new HashMap<>();
         int left =  0;
         int maxLength = 0;

         for(int right=0; right<s.length(); right++){
               Character c = s.charAt(right);
               freq.put(c,freq.getOrDefault(c,0)+1);
               while(freq.size() >k){
                     Character leftChar = s.charAt(left);
                     freq.put(leftChar,freq.get(leftChar)-1);
                     if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
                   
               }
               maxLength = Math.max(maxLength,right-left+1);

         }
         return maxLength;
   }
}

// brute forece
// int maxLength = 0;
        
//         for(int i=0; i<s.length(); i++){
//               Map<Character,Integer>freq = new HashMap<>();

//               for(int j=i; j<s.length(); j++){
//                   freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);

//                   if(freq.size()>k){
//                     break;
//                   }

//                   maxLength = Math.max(maxLength,j-i+1);
//               }
//         }
//         return maxLength;

