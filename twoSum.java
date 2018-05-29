import java.util.HashMap;
public class twoSum{
	
	public static void main(String[] args) {
		int[] nums1 = {2, 7, 11, 12};
		int target = 9;
		System.out.println(twoSum1(nums1, target));
	}
	/**brute force method: time: o(n^2) space: o(n)
	*/
	public static int[] twoSum1(int[] nums, int target){
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == target - nums[i]){
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	/** two iteration hashmap, first store the item in hashmap, then check
	*/
	public static int[] twosum2(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i){
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
/**one pass two sum 
*/
	public static int[] twoSum3(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if(map.containsKey(complement)){
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}