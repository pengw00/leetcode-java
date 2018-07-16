import java.util.*;
import tree.TreeNode;
public class HouseRober{
    public int robhouse(){
        
    }
    public int rob(TreeNode root){
        if(root == null) return 0;//that is the bottom layer, then bubble up
        
        int val = 0;
        if(root.left != null){
            val += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null){
            val += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(root.val + val, rob(root.left) + rob(root.right));
        }
    public void createBinTree(){
        
    }
    public static void main(String[] args){
        int[] input = {1, 2, 3, 1, 3, 5, 6,2,4};
        
    }
    /*for the rob() function, using the recursion (dfs) from bottom-up, recursively
     * add layer and the next.next layer, every layer get the max of the two.
     *
     * 
     */
    
}

