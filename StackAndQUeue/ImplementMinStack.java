import java.util.*;


//  Design a stack that supports the following operations in constant time: push, pop, top, and retrieving the minimum element.

class MinStack{
     
    Stack<int[]> st = new Stack<>();
    
    void push(int value){
          if(st.isEmpty()){
             st.push(new int[]{value,value});
             return;
          }

          int mini = Math.min(getMin(),value);
          st.push(new int[]{value,mini});
    }

    void pop(){
          st.pop();
    }

    int top(){
        return st.peek()[0];
    }

    int getMin(){
         return st.peek()[1];
    }

}

public class ImplementMinStack {
     public static void main(String[] args) {
        MinStack s = new MinStack();

        // Function calls
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " ");
        s.pop();
        System.out.print(s.top() + " ");
        s.pop();
        System.out.print(s.getMin());
     }
}
