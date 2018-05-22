/**
*since the maxarea is limited by the shorter line, 
*moving the shorter line's pointer could turn out to be beneficial;
*
*/


public class ContainerWithMostWater{
	public static void main(String[] args) {
		int[] height = { 2, 3, 1, 5, 6, 7, 9};
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] height){
		int maxarea = 0, l = 0, r = height.length - 1;
		while(l < r){
			maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
			if(height[l] < height[r])
				l++;
			else
				r--;
		}
		return maxarea;
	}
}