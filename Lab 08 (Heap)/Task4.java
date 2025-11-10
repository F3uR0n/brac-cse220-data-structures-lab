public class Task4{

    private static void heapCreation(MaxHeap root, Integer[] arr, int x){
        if(x == arr.length) return;
        root.insert(arr[x]);
        heapCreation(root, arr, ++x);
    }

    private static Integer[] finalOutput(Integer[] u, Integer[] out, int k, int n, int count){
        if(count == k) return out;
        out[count++] = u[n--];
        return finalOutput(u, out, k, n, count);
    }

    public static Integer[] KthSort(Integer[] arr, int k){
        MaxHeap root = new MaxHeap(arr.length);
        heapCreation(root, arr, 0);
        Integer[] u = root.sort();
        Integer[] out = new Integer[k];
        return finalOutput(u, out, k, arr.length-1, 0);
    }
}