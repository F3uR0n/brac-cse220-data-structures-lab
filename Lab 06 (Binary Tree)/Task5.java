public class Task5 {
    private static Integer summation(BTNode root){
        if(root == null) return 0;
        return (int) root.elem + summation(root.left) + summation(root.right);
    }
    public static Integer subtractSummation( BTNode root ){
        int x = summation(root.left);
        int y = summation(root.right);
        return x-y;
    }
}