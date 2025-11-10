public class Task2 {

    private static String helper ( BSTNode root, Integer key , String x){
        if(root == null) return "No Path Found";
        if((int) root.elem == key){
            x += root.elem +" ";
            return x;
        }
        if((int)root.elem > key){
            x += root.elem +" ";
            return helper(root.left, key, x);
        }
        else if((int)root.elem < key){
            x += root.elem +" ";
            return helper(root.right, key, x);
        }
        return "No Path Found";
    }

    public static String findPath( BSTNode root, Integer key ){
        String output = "";
        return helper(root, key, output);
    }
}