package SlidingWindow;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        String s = "aebdecbcba";
    String t = "abcc";
    String Answer = minimumWindowSubString(s,t);
    System.out.println(Answer);
    }
    static String minimumWindowSubString(String s,String t){
         int left = 0;
        int minLen  = Integer.MAX_VALUE;
        int minStart = 0;
         int[] maps = new int[256];
         int[] mapt = new int[256];
          for(int i=0; i<t.length(); i++){
              mapt[t.charAt(i)]++;
          }
        
          for(int right=0; right<s.length();right++){
            maps[s.charAt(right)]++;
              while(contains(maps,mapt)){
                if(right-left+1 < minLen){
                   minLen = right-left+1;
              minStart = left;
                }
              
              maps[s.charAt(left++)]--;
          }
          }
          return minLen == Integer.MAX_VALUE?"":s.substring(minStart,minLen+minStart);
         
    }
    public static boolean contains(int[] maps,int[] mapt){
             for(int i =0; i<256; i++){
                 if(mapt[i]>maps[i]){
                     return false;
                 }
             }
             return true;
          }

}
