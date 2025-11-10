import java.util.Random;

public class Task3 {

    public static void task3A(Node head) {
        Node current = head;
        if (current == null) return;
        while (current!= null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void task3B_recursive(Node head) {
        if (head == null){
            System.out.print(" null ");
            return;
        }
        System.out.print(head.elem + " -> ");
        task3B_recursive(head.next);
    }

    public static int task3C(Node head) {
        Node current = head;
        int sum =0;
        if (current == null) return -1;
        while (current!= null) {
            sum += current.elem;
            current = current.next;
        }
        return sum;
    }

    public static int task3D_recursive(Node head) {
        if (head == null){
            return 0;
        }
        return head.elem + task3D_recursive(head.next);
    }

    public static int task3E(Node head) {
        Node current = head;
        int sum =0, mul=1;
        if (current == null) return 0;
        while (current!= null) {
            if(current.elem%2==0){
                mul *= current.elem;
            }
            else{
                sum += current.elem;
            }
            current = current.next;
        }
        return sum - mul;
    }

    public static int task3F_recursiveSum(Node head) {
        if (head == null) return 0;
        if(head.elem%2!=0){
            return head.elem + task3F_recursiveSum(head.next);
        }
        return task3F_recursiveSum(head.next);
    }
    public static int task3F_recursiveMul(Node head) {
        if (head == null) return 1;
        if(head.elem%2==0){
            return head.elem * task3F_recursiveMul(head.next);
        }
        return task3F_recursiveMul(head.next);
    }
    public static int task3F_recursive(Node head) {
        return task3F_recursiveSum(head) - task3F_recursiveMul(head);
    }

    public static void main(String[] args) {
        // Driver code for testing Task 3 methods
        Node head = arr2LL( generateRandomArray(6, 1, 20) );
        
        System.out.println(" Task3A ");
        System.out.println("Expected Output: ");
        showLL(head);
        System.out.println("Your Output: ");
        task3A(head);

        System.out.println("\n Task3B ");
        System.out.println("Expected Output: ");
        showLL(head);
        System.out.println("Your Output: ");
        task3B_recursive(head);

        System.out.println("------------------------------");

        head = arr2LL( new int[]{23,5,3,11,7,6} );
        System.out.println("\n Task3C ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+55);
        System.out.println("Your Output: "+task3C(head));

        System.out.println("\n Task3D ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+55);
        System.out.println("Your Output: "+task3D_recursive(head));

        System.out.println("------------------------------");

        head = arr2LL( new int[]{3,5,8,3,2} );
        System.out.println("\n Task3E ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+29);
        System.out.println("Your Output: "+task3E(head));

        System.out.println("\n Task3F ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+29);
        System.out.println("Your Output: "+task3F_recursive(head));

        System.out.println("------------------------------");
    }



    //helper methods
    public static Node arr2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            n.next = newNode;
            n = newNode;
        }
        return head;
    }
    
    public static int[] generateRandomArray(int size, int start, int end) {
        if (start > end)
            throw new IllegalArgumentException("Start value must be less than or equal to end value.");
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(end - start + 1) + start;
        return arr;
    }

    public static void showLL(Node head) {
        while (head != null) {
            System.out.print(head.elem + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
