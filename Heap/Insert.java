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
                  leftindex =  smallest;
              }
              if(rightindex < size && array[rightindex] < array[smallest]){
                 rightindex = smallest;
              }

              if(smallest != index ){
                 int temp = array[index];
              array[index] = array[smallest];
           array[smallest] = temp;
              heapify(smallest);
              }
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

/*
  git int 
  git add .
  git commit -m " "
  git remote add orgin
  git puush -M main
 */