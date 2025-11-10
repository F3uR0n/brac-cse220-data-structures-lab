public class Task2 {
    public static Node wordDecoder( Node head ){       
        Node dummyHead = new Node(null, null);
        Node current = head;
        int size = 0;
        while (current!= null) {
            size++;
            current = current.next;
        }
        int index = 0;
        int d = 13%size;
        Node current2 = head;
        Node current3 = dummyHead;
        while(current2 != null){
            if(index !=0 && index%d==0){
                current3.next = current2;
                current3 = current3.next;
            }
            current2 = current2.next;
            index++;
        }
        current3.next = null;
        Node prev = null;
        Node current4 = dummyHead.next;
        while(current4 != null){
            Node temp = current4.next;
            current4.next = prev;
            prev = current4;
            current4 = temp;
        }
        return prev;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
