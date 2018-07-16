import java.util.LinkedList;
import java.util.List;
import tree.TreeNode;

public class BinTreeTraverse{
        private static int[] array = {1,2,3,4,5,6,7,8,9};
        private static List<TreeNode> nodelist = null;

        public static void preOrderTraversal(TreeNode node){
            if(node == null) return;
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
        public static void main(String[] args){
            nodelist = new LinkedList<TreeNode>();
            for(int i = 0; i < array.length; i++){
            nodelist.add(new TreeNode(array[i]));
        }
        for(int j = 0; j < array.length/2-1; j++){
            nodelist.get(j).left = nodelist.get(j*2+1);
            nodelist.get(j).right = nodelist.get(j*2+2);
        }
        int lastParentIndex = array.length/2 - 1;
        nodelist.get(lastParentIndex).left = nodelist.get(lastParentIndex*2+1);
        if(array.length % 2 == 1){
            nodelist.get(lastParentIndex).right = nodelist.get(lastParentIndex*2 +2);
        }
        TreeNode root = nodelist.get(0);
        System.out.println("先序遍历：");
        preOrderTraversal(root);
        }
    }
            
            
            
            
            
            