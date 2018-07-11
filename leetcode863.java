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
            
          
      
      
    
