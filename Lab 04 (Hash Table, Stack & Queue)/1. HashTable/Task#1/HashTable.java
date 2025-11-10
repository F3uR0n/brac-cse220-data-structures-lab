public class HashTable {
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

    private int hashFunction( String key ){
        String y = "";
        int sum= 0;
        int count = 0, count2=1;
        for(int i=0; i<key.length(); i++){
            if(count==2){
                sum += Integer.parseInt(y);
                y="";
                count = 0;
            }
            else{
                int temp = (int)key.charAt(i);
                y += Integer.toString(temp);
                count++;
            }
            count2++;
        }
        if(count2%2!=0){
            String x ="N";
            int temp = (int)x.charAt(0);
            y += Integer.toString(temp);
            sum += Integer.parseInt(y);
        }
        return sum%ht.length;
    }

    public String searchHashtable( Object[] keyValuePair ){
        String x = (String)keyValuePair[0];
        int indexOfHash = hashFunction(x);
        PairNode current = ht[indexOfHash];
        while (current != null){
            if(current.key == x) return "Found";
            current = current.next;
        }
        return "Not Found";
    }

}
