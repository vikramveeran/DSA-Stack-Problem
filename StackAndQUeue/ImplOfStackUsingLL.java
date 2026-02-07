class Node{
     int val;
     Node next;
     Node(int v){
         val = v;
         next = null;
     }
}

class LinkedList{
    private Node head;
    int size;

    LinkedList(){
        head = null;
        size = 0;
    }

   public void push(int x){
          Node element = new Node(x);
          element.next = head;
          head = element;

          size++;
    }
   public int pop(){
        if(head == null){
             return -1;
        }

        int value  = head.val;
        Node temp = head;
        temp  = null;
        size--;
     
        return value;
    }

    public int top(){
         if(head ==  null){
             return -1;
         }
         return head.val;
         
    }

    public boolean isEmpty(){
          return (size == 0);
    }
}

public class ImplOfStackUsingLL {
    public static void main(String[] args) {
        LinkedList st = new LinkedList();
         String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};

        int[][] inputs = {{},{3},{7},{},{},{}};
        for(int i=0; i<commands.length; ++i ){
              if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } 
            else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            }
             else if (commands[i].equals("top")) {
                System.out.print(st.top() + " ");
            } 
            else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } 
            else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
    }
}
