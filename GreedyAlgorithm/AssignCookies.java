package GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int student[] = {1, 2, 3};
        int cookies[] = {1, 1};
        int result = assignCookies(student,cookies);
        System.out.println(result);
    }
    static int assignCookies(int[] student , int[] cookies){
             Arrays.sort(student);
             Arrays.sort(cookies);
            int m = student.length;
            int n = cookies.length;
            int studentIndex = 0;
            int cookiesIndex = 0;

            while(studentIndex < m && cookiesIndex < n){
                 if(student[studentIndex] <= cookies[cookiesIndex]){
                     studentIndex += 1;

                 }
                 cookiesIndex += 1;
            }
            return studentIndex;
    }
}
