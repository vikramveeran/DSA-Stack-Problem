package GreedyAlgorithm;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
          boolean Answer = lemonadeChange(bills);
          System.out.println(Answer);
    }
    static boolean lemonadeChange(int[] arr){
         int five = 0;
         int ten = 0;
         for(int bills : arr){
             if(bills == 5){
                 five++;
             }
            else if(bills == 10){
                 if(five > 0){
                     five--;
                     ten++;
                 }
                else{
                     return false;
                }
            }
            else{
                 if(five > 0 && ten > 0){
                       five--;
                       ten--;
                 }
                else if(five >= 3){
                      five -= 3;
                 }
                 else {
                    return false; 
                }
            }
         }
         return true;
    }
}
