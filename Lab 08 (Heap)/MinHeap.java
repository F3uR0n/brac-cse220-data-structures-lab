//Task 1
public class MinHeap {
    private  Integer sizeOfHeap = 0;
    private  Integer[] arrayOfHeap;

    public MinHeap (int capacity){
        arrayOfHeap = new Integer[capacity];
    }

    public  void swap(int childIdx, int parentIdx){
        int temp = arrayOfHeap[parentIdx];
        arrayOfHeap[parentIdx] = arrayOfHeap[childIdx];
        arrayOfHeap[childIdx] = temp;
    }

    public  void swim(int index){
        if(index == 0) return;
        if(arrayOfHeap[index] < arrayOfHeap[(index-1)/2]){
            swap(index, (index-1)/2);
            swim((index-1)/2);
        }
    }

    public  void sink(int index){
        if((2*index)+1 > sizeOfHeap-1) return;
        if((arrayOfHeap[2*index +2]!=null && arrayOfHeap[2*index+1]!=null) && (arrayOfHeap[index] > arrayOfHeap[2*index+1] || arrayOfHeap[index] > arrayOfHeap[2*index +2])){
            if(arrayOfHeap[2*index+1] < arrayOfHeap[2*index +2]){
                swap(2*index+1, index);
                sink(2*index+1);
            }
            else if(arrayOfHeap[2*index+1] > arrayOfHeap[2*index +2]){
                swap(2*index +2, index);
                sink(2*index +2);
            }
        }
        else if(arrayOfHeap[2*index+1]!=null && arrayOfHeap[2*index+2]==null){
            if(arrayOfHeap[index] > arrayOfHeap[2*index+1]){
                swap(2*index+1, index);
                sink(2*index+1);
            }
        }
    }

    public int extractMin(){
        if(arrayOfHeap[0]==null) return -1;
        int output = arrayOfHeap[0];
        arrayOfHeap[0] = arrayOfHeap[sizeOfHeap-1];
        sizeOfHeap--;
        sink(0);
        return output;
    }

    public void insert(int x){
        arrayOfHeap[sizeOfHeap] = x;
        swim(sizeOfHeap);
        sizeOfHeap++;
    }

    public Integer[] helperSort(Integer[] arr, int x, int y){
        if(x==y) return arrayOfHeap;
        arr[y-1] = extractMin();
        return helperSort(arr, x, --y);
    }

    public Integer[] sort(){
        return helperSort(arrayOfHeap, 0, sizeOfHeap);
    }
}