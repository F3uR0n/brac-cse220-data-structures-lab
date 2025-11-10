public class Task4 {

    private static int helper(BSTNode x, BSTNode y){
        if(x==null || y==null) return 0;
        int sum = (int) x.elem + (int) y.elem;
        return sum+ helper(x.left, y.right) + helper(x.right, y.left);
    }
    public static Integer mirrorSum( BSTNode root ){
        if (root == null) return 0;
        return helper(root.left, root.right);
    }
}