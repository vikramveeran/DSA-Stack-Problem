import java.util.*;

class ArrayStack{
    private int[] stackArray;
    private int capacity;
    private int arrayIndex;

    public ArrayStack(int size){
        capacity = size;
         stackArray = new int[capacity];
        arrayIndex--;
    }

    ArrayStack(){
         this(1000);
    }

    public void push(int x){
          if(arrayIndex > capacity){
               System.out.println("StackOverflow");
          }
          stackArray[++arrayIndex] = x;
    }
   public void pop(){
          
   }
   public void top(){
     
   }

   public boolean isEmpty(){
        
   }



}


class ImplOfStackArray{
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        List<String>commend = Arrays.asList("ArrayList","push","pop","top","push");
        List<List<Integer>>input = Arrays.asList(Arrays.asList(),Arrays.asList(5),Arrays.asList(10),Arrays.asList());
        for(int i=0; i<commend.size(); i++){
               switch(commend.get(i)){
                 case "push":
                 stack.push(input.get(i).get(0));
                 System.out.println("null");
                 break;

                 
               }
        }
    }
}