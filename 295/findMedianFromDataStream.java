//miantain two Priority queue, one is for large and one is for smaller
//slways put the comming ele to the large, and pop 
class MedianFinder{
	private PriorityQueue<Long> small;
	private PriorityQueue<Long> large;
	public MedianFinder(){
		small = new PriorityQueue<>();
		large = new PriorityQueue<>();
	}
	//only two state for the queue size
//1. the logic is that first put the new item into large queue and pop
// 2. the smallest one from the peek of it and put it into small queue,
// 3. lastly, cauz finaly only one item added to the small queue, so we need to know if the 
	// small queue size might larger than the large queue. cuaze the small queue has two scenarios before add new item:
	//1. small size equal large size, so it will be small.size > large.size
	//2. large size = small size + 1, so small size will equal to large size
	public void addNum(int num){
		large.add((long)num);
		small.add(-large.poll());
		if(large.size() < small.size()){
			large.add(-small.poll());
		}
	}
	//
	public double findMedian(){
		return large.size() > small.size() > large.peek() : (large.peek() - small.peek())/2.0;
	}
}