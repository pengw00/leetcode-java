//first solution: Inorder traversal, traversal(root.left) until the end, then trackback to update the min, then right
//   1
  2    3   ----> traversal(1 ---> traversal(2) (----> traversal(1)) ---> backto trversal(2, min = 2 - 1) --> prev = 2, 
1  3  2 4   then to traversal(2, min = 3 - 2) --- back to 1.left --> min = 2 - 1 --> 3 - 1.
//inorder traversal:
public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
    
}
//Second solution: using sorted TreeSet method, TreeSet.ceiling() get the next greater value.
//preorder traversal: recursion, step: add root, then recursion root.left until the end, then add root.right until the end.
public class Solution {
    TreeSet<Integer> set = new TreeSet<>();
    int min = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        if (!set.isEmpty()) {
            if (set.floor(root.val) != null) {
                min = Math.min(min, root.val - set.floor(root.val));
            }
            if (set.ceiling(root.val) != null) {
                min = Math.min(min, set.ceiling(root.val) - root.val);
            }
        }
        
        set.add(root.val);
        
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        
        return min;
    }
}
