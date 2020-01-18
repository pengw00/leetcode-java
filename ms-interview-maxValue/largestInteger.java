//hashset or map solution similar to two sum
public class solution{
	public void public static void main(String[] args) {
		int[] nums1 = new int[]{ 3, 2, -2, 5, -3};
		int[] nums2 = new int[]{ 1, 2, 3, -4 };

	}
	public static int maxValue(int[] nums){
		int res = 0;
		Set<Integer> set = new HashSet<>();
		for(int c: nums){
			if(set.contains(-c)){
				res = Math.max(c, res);
			}
			set.add(c);
		}
		return res;
	}

	public static int maxValue2(int[] nums){
		Arrays.sort(nums);
		int res = 0;
		int l = 0; 
		int r = nums.length;
		while(l < r){
			int sum = nums[l] + nums[r];
			if(sum==0){
				res = nums[r];
				break;
			}else if(sum > 0){
				r--;
			}else{
				l++;
			}
		}
		return res;
	}
}