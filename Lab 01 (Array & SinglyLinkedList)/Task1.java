class Task1{
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){
        Integer[] fin_arr = new Integer[arr1.length + arr2.length];
        int i=0,j=0,count=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]){
                fin_arr[count++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                fin_arr[count++] = arr2[j++];
            }
            else{
                fin_arr[count++] = arr1[i++];
                fin_arr[count++] = arr2[j++];
            }
        }
        while (i>=arr1.length && j<arr2.length) {
            fin_arr[count++] = arr2[j++];
        }
        while (i<arr1.length && j>=arr2.length){
            fin_arr[count++] = arr1[i++];
        }
        return fin_arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
