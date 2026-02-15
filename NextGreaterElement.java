import java.util.*;

public class NextGreaterElement {  //Monoatomic stack
    public static void main(String[] args) {
        int[] array1 = {4, 5, 2, 10};
        System.out.println(Arrays.toString(nextGreaterElement(array1)));

    }

    static  int[] nextGreaterElement(int[] array1){
        int n = array1.length;
         Stack<Integer>st = new Stack<>();
         int array2[] = new int[n];
         for(int i=n-1; i>=0; i--){
             while(!st.isEmpty() && st.peek() <= array1[i]){
                 st.pop();
             }
             if(st.empty()){
                 array2[i] = -1;
             }
             else{
                 array2[i] = st.peek();
             }
             st.push(array1[i]);
         }
         return array2;
    }
}

//TC -> O(N)
//SC -> O(N)

