class solution {
    public boolean isSubtree(Treenode s, TreeNode t){
        if(s == null) {
            return false;
        }
        if (sameTree(s, t)) {
            return tree;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    public boolean sametree(TreeNode s, TreeNode t) {
        if (s== null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        return s.val == t.val && sameTree(s.left, t.left) && sametree(s.right, t.left);
    }
}