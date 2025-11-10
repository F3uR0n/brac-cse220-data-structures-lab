class Task2{
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        Integer[] finalOutput = new Integer[matrix[0].length - 1];
        Integer prevSum = 0;
        Integer currentSum = 0;
        for(int j=0; j<matrix[0].length; j++){
            Integer sum = 0;
            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][j];
            }
            prevSum = currentSum;
            currentSum = sum;
            if(j>0){
                finalOutput[j-1] = (currentSum-prevSum);
            }
        }
        return finalOutput;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}