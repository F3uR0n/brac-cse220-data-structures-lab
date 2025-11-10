public class Task3{

    private static void heapCreation(MinHeap root, Integer[] arr, int y){
        if(arr.length==y) return;
        int temp = root.extractMin();
        int temp2 = arr[y];
        root.insert(temp+temp2);
        heapCreation(root, arr ,++y);
    }

    public static void insertionZero(MinHeap root, int x, int y){
        if(y==x) return;
        root.insert(0);
        insertionZero(root, x, ++y);
    }

    public static Integer[] insertion(Integer[] arr, int x){
        MinHeap root = new MinHeap(x);
        insertionZero(root, x, 0);
        heapCreation(root, arr, 0);
        return root.sort();
    }
}