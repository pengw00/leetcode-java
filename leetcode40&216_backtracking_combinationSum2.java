package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListDemo {
    public static List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs_com(cand, 0, target, path, res);
        return res;
    }
    
    public static List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }
    
    public static void combination(List<List<Integer>> ans, List<Integer> comb, int k, int start, int n){
        if(comb.size() == k && n ==0){
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
        for(int i = start; i<= 9; i++){
            comb.add(i);
            combination(ans, comb, k, i+1, n-i);
            comb.remove(comb.size()- 1);
        }
    }
    
    public static void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
    if (target == 0) {
        res.add(new ArrayList(path));
        return ;
    }
    if (target < 0) return;
    for (int i = cur; i < cand.length; i++){
        if (i > cur && cand[i] == cand[i-1]) continue;
        path.add(path.size(), cand[i]);
        //System.out.println(target);
        dfs_com(cand, i+1, target - cand[i], path, res);
        path.remove(path.size()-1);
        //System.out.println(cand[i]);
    }
}
    
   public static void main(String[] args) {

      // create an empty array list with an initial capacity
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
      int[] candidates = {10,1,2,7,6,1,5};
      int target = 8;
       // use add() method to add elements in the list
      arrlist.add(15);
      arrlist.add(22);
      arrlist.add(30);
      arrlist.add(40);

      // adding element 25 at third position
      arrlist.add(2,25);
      
      // let us print all the elements available in list
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }  
      List<List<Integer>> res1= new ArrayList<List<Integer>>();
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      res1 = combinationSum3(3,7);
      res = combinationSum2(candidates, target);
      System.out.println(res);
      System.out.println(res1);
   }
   
}
