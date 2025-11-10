public class Task1 {
    public static BTNode convertMirror( BTNode root ){
        if(root==null) return null;
        BTNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        convertMirror(root.left);
        convertMirror(root.right);
        return root;
    }
}