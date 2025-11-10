class Task2{
    public static void mostWater( Integer[] height ){
        int maximum = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i; j<height.length; j++){
                if (height[i]>height[j]){
                    int temp = height[j]*(j-i);
                    if(temp>maximum){
                        maximum = temp;
                    }
                }
                else if (height[j]>height[i]){
                    int temp = height[i]*(j-i);
                    if(temp>maximum){
                        maximum = temp;
                    }
                }
                else{
                    int temp = height[i]*(j-i);
                    if(temp>maximum){
                        maximum = temp;
                    }
                }
            }
        }
        System.out.println(maximum);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
