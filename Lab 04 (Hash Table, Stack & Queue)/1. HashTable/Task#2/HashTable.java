public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    private int hashFunction( String key ){
        int sum=0;
        for(int i=0; i<key.length(); i++){
            if(key.length()%2==0 && i%2==0){
                char ch = key.charAt(i);
                sum += (int)ch;
            }
            else if(key.length()%2!=0 && i%2!=0){
                char ch = key.charAt(i);
                sum += (int)ch;
            }
        }
        return sum%ht.length;
    }

    public void insert(String key, Integer value){
        int index = hashFunction(key);
        FruitNode newOne = new FruitNode(key, value);
        if(ht[index] == null){
            ht[index] = newOne;
        }
        else{
            FruitNode prev = ht[index];
            if(prev.fruit[0] == key){
                if((int) prev.fruit[1] < value){
                    ht[index] = newOne;
                    newOne.next = prev.next;
                    return;
                }
            }
            if((int) prev.fruit[1] < value){
                newOne.next = prev;
                return;
            }
            FruitNode next = prev.next;
            while(next!=null){
                if(next.fruit[0] == key){
                    if((int) next.fruit[1] < value){
                        prev.next = newOne;
                        newOne.next = next.next;
                        return;
                    }
                }
                if((int) next.fruit[1] < value){
                    prev.next = newOne;
                    newOne.next = next;
                    return;
                }
                else{
                    next = next.next;
                    prev = prev.next;
                }
            }
            prev.next = newOne;
        }
    }
}
