public class Task6 {
    public static Integer sum(Integer x, Integer lvl){
        if(lvl%2==0) return -x;
        return x;
    }
    private static Integer levelSum( BTNode root, int lvl ){
        if(root == null) return 0;
        int sum = sum( (int) root.elem, lvl);
        return sum + levelSum(root.left, lvl+1) + levelSum(root.right, lvl+1);
    }
    public static Integer levelSum( BTNode root ){
        return levelSum(root, 0);
    }
}