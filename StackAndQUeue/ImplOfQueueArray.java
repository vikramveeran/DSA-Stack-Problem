class ArrayQueue{
     int[] array;
     int start;
     int end;
     int currentSize;
     int maxSize;

     ArrayQueue(){
        array = new int[10];
         end = -1;
         start = -1;
         currentSize = 0;
         maxSize = 10;
     }

       public  void push(int x){
          if(currentSize == maxSize){
               System.out.println("Queue is full");
          }
          if(end == -1){
               start = 0; 
               end = 0;
          }
          else{
             end  = (end + 1)%maxSize;
          }
          array[end] = x;
          currentSize++;
     }

     public int pop(){
          if(start == -1){
              System.out.println("queue is empty");
              System.exit(1);
          } 

          int popped = array[start];
          if(currentSize == 1){
             start = -1;
             end = -1;
          }
          else{
             start = (start+1)%maxSize;
            
          }
           currentSize--;
           return popped;
     }

     int peek(){
         if(start == -1){
              System.out.println("queue is empty");
              System.exit(1);
          } 

          return array[start];
     }

     boolean isEmpty(){
           return (currentSize == 0);
     }
}
public class ImplOfQueueArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        String[] commend  = {"ArrayQueue", "push", "push",  "peek", "pop", "isEmpty"};
        int[][] inputs = {{},{5},{10},{},{},{}};
         for(int i=0; i<commend.length;i++){
              switch (commend[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "ArrayQueue":
                    System.out.print("null ");
                    break;
              }
         }
    }
}

