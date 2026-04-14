package Heap;

public class Insert {
     
   static class BinaryHeap{
         int capacity;
         int size = 0;
         int[] array;
         BinaryHeap(int cap){
             capacity = cap;
            array = new int[capacity];
         }
         
         int parent(int i){
             return (i-1)/2;
         }

         int left(int i){
              return (2*i)+1;
         }

         int  right(int i){
             return (2*i)+2;
         }

         int getMin(){
             return array[0];
         }

         void insert(int x){
             if(size == capacity){
                 System.out.println("binaryHeap is overflowed");
                 return;
             }
             array[size]=x;
             int k = size;
             size++; 
             while(k!=0 &&  array[parent(k)]>array[k]){
                    int temp = array[parent(k)];
                    array[parent(k)]  = array[k];
                    array[k] = temp;
                    k =  array[parent(k)];
             }
         }

        
         void heapify(int index){
              int leftindex = left(index);
              int rightindex = right(index);

              int smallest =  index;
              if(leftindex < size  && array[leftindex] < array[smallest] ){
                    smallest = leftindex;
              }
              if(rightindex < size && array[rightindex] < array[smallest]){
                  smallest = rightindex ;
              }

              if(smallest != index ){
                 int temp = array[index];
              array[index] = array[smallest];
           array[smallest] = temp;
              heapify(smallest);
              }
        }

        int extractMin(){
             if(size<=0){
                return Integer.MAX_VALUE;   
             }
             if(size == 1){
                 size--; 
                 return array[0];
             }

             int min = array[0];
             array[0] = array[size-1];
             size--;
             heapify(0);
             return min;
        }

        void decreaseKey(int i, int val){
    array[i] = val;

    while(i != 0 && array[parent(i)] > array[i]){
        int temp = array[parent(i)];
        array[parent(i)] = array[i];
        array[i] = temp;

        i = parent(i);
    }
}

void delete(int i){
    decreaseKey(i, Integer.MIN_VALUE);
    extractMin();
}
        
          void printHeap(){
    for(int i = 0; i < size; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
    }
    }
 
    public static void main(String[] args) {
          BinaryHeap heap = new BinaryHeap(20);
           heap.insert(4);
           heap.insert(1);
           heap.insert(2);
           heap.insert(6);
           heap.insert(7);
           heap.insert(3);
           heap.insert(8);
           heap.insert(5);
           heap.printHeap();
            heap.heapify(0);
  }   
}
