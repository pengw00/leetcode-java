public class leetcode632SmallestRange{
	public int[] SmallestRange(int[][] nums){
		int minx = 0;
		int miny = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++){
			for(int j =0; j< nums[i].length; j++){
				for(int k = i; k < nums.length; k++){
					for(int l = (k==i ? j:0); l < nums[k].length; l++){
						int min  = Math.min(nums[i][j], nums[k][l]);
						int max = Math.max(nums[i][j], nums[k][l]);
						int n, m;
						for(m = 0; m < nums.length; m++){
							for(n = 0; n < nums[m].length; n++){
								if(nums[m][n] >= min && nums[m][n] <= max)
									break;
							}
							if(n == nums[m].length)
								break;
						}
						if(m==nums.length){
							if(miny - minx > max- min || (miny - minx == max - min && minx > min)){
								miny = max;
								minx = min;
							}
						}
					}
				}
			}
		}
		return new int[] {minx, miny};
	}
	public static void main(String[] args) {
		leetcode632SmallestRange test = new leetcode632SmallestRange();
		int[][] nums1 = new int[][]{{4,10,15,24,26}, {0,912,20},{5,18,22,30}};
		int[] res = test.SmallestRange(nums1);
		for(int c: res){
			System.out.println(c);
		}
		return;
	}
}