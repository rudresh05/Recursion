
class TreeNode{
    int val;
    TreeNode right, left;
    TreeNode(int val){
        this.val = val;
        right =left= null;
    }
}
public class Recursion04 {
    TreeNode root;
     public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null ) return 0;
        int sum =0;
        if(root.left != null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        
        sum+= sumOfLeftLeaves(root.left);
        sum+= sumOfLeftLeaves(root.right);
        
        return sum;
    }
    public static void main(String[] args) {
        Recursion04 tree = new Recursion04();
         tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right= new TreeNode(5);
        System.out.println(sumOfLeftLeaves(tree.root));
    }
}
