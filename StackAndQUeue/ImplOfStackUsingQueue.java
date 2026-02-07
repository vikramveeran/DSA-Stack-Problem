import java.util.*;

public class ImplOfStackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
     for (int i = 0; i < q.size(); i++) {
      System.out.println(q.add(q.poll()));
      System.out.println(q);
        }
     
    }
    
    

}
