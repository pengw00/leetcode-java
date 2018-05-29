import java.util.Arrays;
public class threeSumCloset{
    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, 4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = nums[0] + nums[1] + nums[2];
        for(int first = 0; first < nums.length-2; first++){
            if( first > 0 && nums[first] == nums[first - 1]) continue;
            int second = first + 1;
            int third = nums.length - 1;
            while(second < third){
                int curSum = nums[first] + nums[second] + nums[third];
                if(curSum == target) return curSum;
                if(Math.abs(target - curSum) < Math.abs(target - closet)){
                    closet = curSum;
                }
                if(curSum > target){
                    third--;
                }else{
                second++;
                }
            }
        }
        return closet;
    }
}