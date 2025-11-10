import java.util.Arrays;

public class TesterFile {
    public static void main(String[] args){

        //Task 1
        MinHeap m1 = new MinHeap(15);
        m1.insert(15);
        m1.insert(4);
        m1.insert(42);
        m1.insert(6);
        m1.insert(215);
        m1.insert(68);
        m1.insert(2);
        m1.insert(456);
        m1.insert(64);
        m1.insert(45);

        System.out.println("Extracted min: " + m1.extractMin());
        System.out.println("Extracted min: " + m1.extractMin());
        System.out.println("Extracted min: " + m1.extractMin());
        
        m1.insert(2);
        m1.insert(63);

        System.out.println("Extracted min: " + m1.extractMin());
        System.out.println(Arrays.toString(m1.sort()));

        //Task 2
        MaxHeap m2 = new MaxHeap(15);
        m2.insert(15);
        m2.insert(4);
        m2.insert(42);
        m2.insert(6);
        m2.insert(215);
        m2.insert(68);
        m2.insert(2);
        m2.insert(456);
        m2.insert(64);
        m2.insert(45);

        System.out.println("Extracted max: " + m2.extractMax());
        System.out.println("Extracted max: " + m2.extractMax());
        System.out.println("Extracted max: " + m2.extractMax());
        
        m2.insert(2);
        m2.insert(63);

        System.out.println("Extracted max: " + m2.extractMax());
        System.out.println(Arrays.toString(m2.sort()));

        //Task 3
        Integer[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        System.out.println(Arrays.toString(Task3.insertion(tasks, m)));
        
        //Task 4
        Integer[] x = {4, 10, 2, 8, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(Task4.KthSort(x, k)));
    }
}