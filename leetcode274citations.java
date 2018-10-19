/*
*从后向前扫描，因为从小到大更新，在最高处h比较小，第一判断条件为citations[i] >= n-1;
*second step: base on condition of if i == 0, there will be no i -1 (out od boundary
*so if(citations[i] >= n) return n; else return 0;
*using arrays.sort() will make the time: O(nlogn)
*
QuickSelect: make time limited in O(N) comparing with binarySearch the boundary is
really really important
*/
/*counting sort, works but when the number of publications is unlimited. Many scientists 
** out there have publications with billions of citations
** we don't need to do any actual sorting, we only need to know the less-than pr equal or 
**greater than int order to find the answers
**the optimal solution will be 0(n) and o(1); know about the logic rightly
**follow up: is it possible that there are more than one valid 
value for h? this problem hints that it is, but the corrcet answer is 
it isn't
*/
class quickselection(){
	public int h-index-fast( int[] citations){
		int n = citations.length, h = Integer.MIN_VALUE;
		int lo = 0;
		int hi = citations.length-1;
		while(lo <= hi){
			int p = partition(citations, lo, hi);
			if(citations[p] < n - p){
				lo = p + 1;
			}else{
				h = Math.max(h, n -p);
				hi = p - 1;
			}
		}
		return h != Math.MIN_VALUE? h:0;

	}
	private int partition(int[] nums, int lo, int hi){
		int p = lo;
		swap(int[] nums, lo, hi);
		for(int i = lo; i < hi; i++ ){
			if(nums[i] <= nums[hi]){
				swap(nums, i, p);//move the smaller one to the left
				p++;
			}
		}
		swap(nums, p, hi);
		return p;
	}
	private void swap(nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}


}