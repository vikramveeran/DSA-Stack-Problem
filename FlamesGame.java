import java.util.Arrays;

public class FlamesGame {

    public static void main(String[] args) {
        String[] array  =  {"f","l","a","m","e","s"};
        String[] Answer = flames(array);
       System.out.println(Arrays.toString(Answer));
    }

     static String[] countUntilLenthOne(int length,String[] arr){
        
                       int index = length - arr.length; 

                       String valueToRemove  = arr[index-1];

                       int ind = -1;
                       for(int i=0; i<arr.length; i++){
                          if(arr[i] == valueToRemove){
                             ind = i;
                             break;
                          }
                       }

                       if(ind != -1){
                           for(int i=ind; i<arr.length-1; i++){
                              arr[i] = arr[i+1];
                           }
                       }
                       int start1  = index;
                       int end1 = arr.length;

                       int start2 = 0;
                       int end2 = index-1;
                    String[] array2 = new String[arr.length];

                        int j = 0;
                       for(int i=start1; i<end1; i++){
                             array2[j] = arr[i];
                             j++;
                       }
    

                    for(int i=start2; i<end2; i++){
                          array2[j] = arr[i];
                          j++;
                    }

                

                    return array2;     
                       
         }
    static String[] flames(String[] array){

        for(int i=0; i<7; i++){
            countUntilLenthOne(7,array);
        }
          
          return array;
    } 
}


