//Question 4. Maximum Candies You Can Get from Boxes.

// bfs level by level using deque from uwi

	class Solution {
	    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
	        int n = status.length;
	        boolean[] got = new boolean[n];
	        boolean[] done = new boolean[n];
	        Queue<Integer> q = new ArrayDeque<>();
	        for(int v : initialBoxes){
	        	q.add(v);
	        	got[v] = true;
	        }
	        int ans = 0;
	        while(!q.isEmpty()){
	        	int cur = q.poll();
	        	if(status[cur] == 1 && !done[cur]){
	        		done[cur] = true;
	        		ans += candies[cur];
	        		done[cur] = true;
	        		for(int k : keys[cur]){
	        			status[k] = 1;
	        			if(got[k]) q.add(k);
	        		}
	        		for(int k : containedBoxes[cur]){
	        			got[k] = true;
	        			q.add(k);
	        		}
	        	}
	        }
	        return ans;
	    }
	}
