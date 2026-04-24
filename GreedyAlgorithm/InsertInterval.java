package GreedyAlgorithm;
import java.util.*;

class InsertInterval{
     public static void main(String[] args) {
          int[][] arr = {{1,3}, {6,9}};
        int[] newInterval = {2,5};

        int[][] result = insertInterval(arr, newInterval);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
     }
     static int[][] insertInterval(int[][] interval,int[] newInterval){
          ArrayList<int[]>li = new ArrayList<>();
         int i = 0;
         int n = interval.length;
         while(i < n && interval[i][1] < newInterval[0]){
             li.add(interval[i]);
             i++;
         }
         while(i < n && interval[i][0] < newInterval[1]){
             newInterval[0] = Math.min(newInterval[0],interval[i][0]);
             newInterval[1] = Math.max(newInterval[1],interval[i][1]);
             i++;
         }
         li.add(newInterval);

          while (i < n) {
            li.add(interval[i]);
            i++;
        }
          return li.toArray(new int[li.size()][]);
     }
}