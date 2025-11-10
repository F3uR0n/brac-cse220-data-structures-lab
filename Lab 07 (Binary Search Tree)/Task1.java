public class Task1 {

    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        if(root==null) return null;
        if(x< (int) root.elem && y< (int) root.elem){
            return lowestCommonAncestor(root.left, x, y);
        }
        else if(x> (int) root.elem && y> (int) root.elem){
            return lowestCommonAncestor(root.right, x, y);
        }
        return (int) root.elem;
    }
}