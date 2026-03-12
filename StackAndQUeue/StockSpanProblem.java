import java.util.*;
public class StockSpanProblem {
   public static void main(String[] args) {
     int arr[] = {15,13,12,14,16,20};
     int[] Answer = stockSpan(arr);
     System.out.println(Arrays.toString(Answer));
   }
   static int[] stockSpan(int[] arr){
       Stack<Integer>st = new Stack<>();
       int[] result = new int[arr.length];
      result[0] = 1;
      st.push(0);
       for(int i=1; i<arr.length; i++){
           while(!st.empty() && arr[i] >arr[st.peek()]){
             st.pop();
           }
          if( !st.isEmpty() && arr[i]<arr[st.peek()]  ){
             result[i] = i-st.peek();
          }
          else if(st.empty()){
             result[i] = i+1;
          }
            st.push(i);
       }
       return result;
   }
}



// brute force :-
// int n = arr.length;
//       int[] result = new int[n];
//       result[0] = 1;
//       for(int i=0; i<n; i++){
//          for(int j=i; j>=0; j--){
//               if(arr[i]<arr[j]){
//                   result[i] = i-j;
//                   break;
//               }
//          }
//       }
//       return result;