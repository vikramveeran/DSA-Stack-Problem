package SlidingWindow;
import java.util.*;
public class MaximumPointsObtainedByCards {
      public static void main(String[] args) {
         int[] arr  = {1, 2, 3, 4, 5, 6};
         int k = 3;
         int Answer =  maximumPointsObtainedByCards(arr,k);
         System.out.println(Answer);
      }
      static int maximumPointsObtainedByCards(int [] arr,int k){
        int n = arr.length;
        int leftside = 0; 
        int rightside = 0;
        int maxsum = -1;
        for(int i=0; i<k; i++){
             leftside += arr[i];
        }
         int rightindex = n-1;
        for(int i=k-1; i>=0; i--){
             leftside = leftside-arr[i];
             rightside += arr[rightindex];      
             maxsum = Math.max(maxsum,leftside+rightside);    
             rightindex--;       
        }
        return maxsum;
      }
}


