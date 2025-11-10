public class Task3 {
    private static Integer calcu (int x, int lvl){
        if(lvl != 0) return x%lvl;
        return x;
    }
    private static Integer sumTree( BTNode root, int lvl){
        if(root == null) return 0;
        int sum = calcu( (int) root.elem, lvl);
        return sum + sumTree(root.left, lvl+1) + sumTree(root.right, lvl+1);
    }
    public static Integer sumTree( BTNode root ){
        return sumTree(root, 0);
    }
}