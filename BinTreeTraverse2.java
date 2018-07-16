import tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class BinTreeTraverse2{
	private int[] array = {1,2,3,4,5,6,7,8,9,0};
	private static List<TreeNode> nodelist = null;
	public void createBinTree(){
		nodelist = new LinkedList<>();
		for(int i = 0; i < array.length; i++){
			nodelist.add(new TreeNode(array[i]));
		}
		for(int j = 0; j < array.length / 2 -1; j++){
			nodelist.get(j).left = nodelist.get(j * 2 + 1);
			nodelist.get(j).right = nodelist.get(j * 2 + 2);
		}
		int lastIndex = array.length / 2 - 1;
		nodelist.get(lastIndex).left = nodelist.get(lastIndex * 2 + 1);
		if(array.length % 2 == 1){
			nodelist.get(lastIndex).right = nodelist.get(lastIndex * 2 + 2);
		}
	}
	//Leetcode623: AddOneRow
	public static TreeNode AddOneRow(TreeNode t, int v, int d){
		if(d==1){
			TreeNode n = new TreeNode(v);
			n.left = t;
			return n;
		}
		insert(v, t, 1, d);
		return t;
	}
	//insert function:
	public static void insert(int val, TreeNode node, int depth, int n){
		if(node ==null) return;
		if(depth == n-1){
			TreeNode t = node.left;
			node.left = new TreeNode(val);
			node.left.left = t;
			t = node.right;
			node.right = new TreeNode(val);
			node.right.right = t;
		}else{
			insert(val, node.left, depth + 1, n);
			insert(val, node.left, depth + 1, n);
		}
	}
	public static int number = 0;
	public static void preOrderTraversal(TreeNode node){
		if(node == null) return;
		System.out.print(node.val + " ");
		//System.out.print(node.left.val + " ");
		//System.out.print(node.right.val + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
		//System.out.println();
	}
	public static void main(String[] args){
		BinTreeTraverse2 binTree = new BinTreeTraverse2();
		binTree.createBinTree();
		TreeNode root = nodelist.get(0);
		System.out.println("preOrderTraversal: ");
		preOrderTraversal(root);
		System.out.println();
		AddOneRow(root, 5, 3);
		preOrderTraversal(root);

	}


}