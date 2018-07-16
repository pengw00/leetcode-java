//idea: level traversal// bfs and dfs
//Notes: queue.add() did throw an exception while queue.offer() does not; the same as remove() and poll() 
//solution:anotation parent, using bfs to mark all the node's parent using HashMap, then using breadth first
//search to find the neighbour level by level, a node with it's left, right and parent is one level, 
//with a null node to separate the level when the level distance == 2, put the queue into the list. And done. 
// directly point to the target node and traversal to level k, using HashSet to judge whether the node's 
//left, right and parent has been addedinto the queue
class solution{
  Map<TreeNode,TreeNode> parent;
  public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
    parent = new HashMap<>();
    // put all the node to a map with it's value as it's parent. 
    dfs(root, null); 
    
    Set<TreeNode> seen = new HashSet<>();
    set.add(null);
    set.add(target);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(null);
    queue.add(target);
    int dist = 0;
    while(!queue.isEmpty()){
      TreeNode node = queue.poll();
      if(node == null){
        if(dist == k){ // if the level == k, then all the treenode in the queue will be the result
          List<Integer> ans = new ArrayList<>();
          for(TreeNode n: queue){
            ans.add(n);
            }
          return ans;
        }
        queue.offer(null);
        dist++;//after every level(meet null), increase the cur level by dist++
      else{
      //breath first search the node all neighbor, left right parent(which contained in hashmap
          if(!seen.contains(node.left){ // avoid add duplicate parent node or child node;
            seen.add(node.left);
            queue.offer(node.left);
          if(!seen.contains(node.right)){
             seen.add(node.right);
             queue.offer(node.right);
          TreeNode par = parent.get(node);
          if(!seen.contains(par)){
            seen.add(par);
            queue.offer(par);
            }
          }
        }
        return new ArrayList<Integer>();
     }
     public void dfs(TreeNode node, TreeNode par){
        if(node != null){
          parent.put(node, par);
          dfs(node.left, node);//depth first search to put the node and its' parent into the map
          dfs(node.right, node);
          }
         }
}
            
          
/*solution two depth first search, if the target on the right of the node with dist of 2, we will recursively search it 
on the left by using a subtree_add() function with parameter of k-2, and similarly as target at the left
*/
class solution2{
  List<Integer> ans;
  TreeNode target;
  int K;
  public List<Integer> distanceK(TreeNode root, TreeNode target, int K){
    ans = new LinkedList<>();//define subclass but recursively make it List() = LinkedList() right!!
    this.K = K;
    dfs(root);
    return ans;
  }
  //return the distance from the node to the target(which is in the node's branch
  public int dfs(TreeNode node){
    if(node == null) return -1;
    else if(node == target){
      subtree_add(node,0);//add the node == target into the ans list
      return 1;//is the node is the target the distance will be 1, since the 
               //since the distance between node's left and right is 2
    }else{
      int L = dfs(node.left), R = dfs(node.right);
      if(L != -1){
        if(L==K) ans.add(node.val);
        subtree_add(node.right,L+1);
        return L+1;
      }else if(R != -1){
        if(R==K) ans.add(node.val);
        //with every node  in the opposite side we will search the other side
        subtree_add(node.left,R+1);//the distance between node's left and right is 2
        return R+1;
      }else{
        return -1; // if there is no target in the node's children, ignore it,the distance will be -1
      }
    }
  }
  // search subtree function depth first search
  public void subtree_add(TreeNode node, int dist){
    if(node == null) return; // if 
    if(dist == K) 
      ans.add(node.val);
    else{
      subtree_add(node.left, dist+1);
      subtree_add(node.right, dist+1);
    }
  }
}
             
        
    
    
