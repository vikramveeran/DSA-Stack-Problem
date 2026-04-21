package GreedyAlgorithm;

public class JumpGame1 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 1, 2};
     boolean result = jumpGame1(nums);
     System.out.println(result);
    }
     static boolean jumpGame1(int[] nums){
        int maxIndex = 0;
         for(int i=0; i<nums.length; i++){
             if(i >maxIndex){
                 return false;
             }
             maxIndex =  Math.max(maxIndex, i + nums[i]);
         }
         return true;
     }
}
