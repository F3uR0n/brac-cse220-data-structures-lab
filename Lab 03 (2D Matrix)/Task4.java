class Task4{
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        Integer[][] output = new Integer[2][2];
        Integer sum1 =0, sum2 =0, sum3 =0, sum4 =0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(i<matrix.length/2 && j<matrix[0].length/2){
                    sum1 += matrix[i][j];
                }
                else if(i<matrix.length/2 && j>=matrix[0].length/2){
                    sum2 += matrix[i][j];
                }
                else if(i>=matrix.length/2 && j<matrix[0].length/2){
                    sum3 += matrix[i][j];
                }
                else if(i>=matrix.length/2 && j>=matrix[0].length/2){
                    sum4 += matrix[i][j];
                }
            }
        }
        output[0][0] = sum1;
        output[0][1] = sum2;
        output[1][0] = sum3;
        output[1][1] = sum4;
        return output;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}