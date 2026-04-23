package GreedyAlgorithm;

import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
         int[] jobs = {4, 3, 7, 1, 2};
        float result = calculateAverageWaitTime(jobs);
         System.out.println(result);
    }
    static float calculateAverageWaitTime(int[] jobs){  
        Arrays.sort(jobs);
         int n =  jobs.length;
         int totalTime = 0;
         int waitTime = 0;
         for(int i=0 ;i<jobs.length; i++){
              waitTime += totalTime;
              totalTime += jobs[i];
         }
         return waitTime/n;
    }
}


