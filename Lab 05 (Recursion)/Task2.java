import java.util.Arrays;
import java.util.Random;
public class Task2 {

    public static void task2A(int[] arr) {
        int i=0;
        while (i<arr.length){
            System.out.print(arr[i] +" ");
            i++;
        }
        System.out.println();
    }

    public static void task2B_recursive(int[] arr, int i) {
        if(i>=arr.length) return;
        System.out.print(arr[i] +" ");
        task2B_recursive(arr, i+1);
    }

    public static int task2C(int[] arr) {
        int i=0, sum =0;
        while (i<arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static int task2D_recursive(int[] arr, int i) {
        if(i>=arr.length) return 0;
        return arr[i] + task2D_recursive(arr, i+1);
    }

    public static int task2E(int[] arr) {
        int sum =0, mul=1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum+= arr[i];
            }
            else{
                mul *= arr[i];
            }
        }
        return mul-sum;
    }

    public static int task2F_recursiveSum(int[] arr, int i) {
        if(i>=arr.length) return 0;
        if(arr[i]%2==0) 
            return arr[i] + task2F_recursiveSum(arr, i+1);
        return task2F_recursiveSum(arr, i+1);
    }
    public static int task2F_recursiveMul(int[] arr, int i) {
        if(i>=arr.length) return 1;
        if(arr[i]%2!=0) 
            return arr[i] * task2F_recursiveMul(arr, i+1);
        return task2F_recursiveMul(arr, i+1);
    }
    public static int task2F_recursive(int[] arr) {
        return task2F_recursiveMul(arr, 0) - task2F_recursiveSum(arr, 0);
    }

    //DRIVER CODE
    public static void main(String[] args) {
        // Driver code for testing Task 2 methods
        // task2A
        System.out.println(" Task2A ");
        int[] arr = generateRandomArray(6, 1, 20);
        System.out.println("Expected Output: "+Arrays.toString(arr));
        System.out.print("Your Output    : ");
        task2A(arr);
        System.out.println();

        // task2B_recursive
        System.out.println("\n Task2B ");
        System.out.println("Expected Output: "+Arrays.toString(arr));
        System.out.print("Your Output    : ");
        task2B_recursive(arr, 0);
        System.out.println();

        System.out.println("\n----------------------------");

        // task2C
        System.out.println("\n Task2C ");
        arr = new int[]{3,2,45,1,2,52};
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+105);
        System.out.print("Your Output    : "+task2C(arr));
        System.out.println();

        // task2D_recursive
        System.out.println("\n Task2D ");
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+105);
        System.out.print("Your Output    : "+task2D_recursive(arr, 0));

        System.out.println("\n----------------------------");

        // task2E
        System.out.println("\n Task2E ");
        arr = new int[]{3,5,8,3,2};
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+35);
        System.out.print("Your Output    : "+task2E(arr));
        System.out.println();

        // task2F_recursive
        System.out.println(" \nTask2F ");
        System.out.println("The Array: "+Arrays.toString(arr));
        System.out.println("Expected Output: "+35);
        System.out.print("Your Output    : "+task2F_recursive(arr));

        System.out.println("\n----------------------------");
    }

    //helper methods
    public static int[] generateRandomArray(int size, int start, int end) {
        if (start > end)
            throw new IllegalArgumentException("Start value must be less than or equal to end value.");
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(end - start + 1) + start;
        return arr;
    }
}
