import java.util.*;
public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] array1 = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};
        System.out.println(Arrays.toString(nextGreaterElement(array1)));
    }
    //optimal approch
    static int[] nextGreaterElement(int[] array1){
        int n = array1.length;
        int[] array2 = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1; i>=0; i--){
              while(!st.empty() && st.peek() <=  array1[i%n]){
                   st.pop();
              }
              if(i<n){
                 if(st.empty()){
                     array2[i%n] = -1;
                 }
                 else{
                     array2[i%n] = st.peek();
                 }
              }
              st.push(array1[i%n]);
        }
        return array2;
    }
}
// TC:- O(4N)
// SC:-O(2N)+o(n)


 // brute Force
    // static int[] nextGreaterElement(int[] array1){
    //     int n = array1.length;
    //     int[] array2 = new int[n];
    //      for(int i=0; i<n; i++){
    //          for(int j=i+1; j<i+n-1; j++){
    //              int currindex = j%n;
    //              if(array1[currindex] > array1[i]){
    //                 array2[i] = array1[currindex];
    //                 break;
    //              }
    //              else{
    //                  array2[i] = -1;
    //              }
    //          }
    //      }
    //      return array2;
    // }
// TC :- O(n^2)
// SC :- O(N)

