public class Task2 {
    public static void smallestLevel( BTNode root, Integer[] levelArray, int lvl ){
        if(root == null) return;
        if(levelArray[lvl]==null){
            levelArray[lvl] = (int)root.elem;
        }
        else{
            levelArray[lvl] = Integer.min(levelArray[lvl], (int)root.elem);
        }
        smallestLevel(root.left, levelArray, lvl+1);
        smallestLevel(root.right, levelArray, lvl+1);
    }
}