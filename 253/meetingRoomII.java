//greedy solution with intervals sort by the start time, so
// there will be no need to worry about the new comppming intervals 
// conflict with the previous one. like the earlier room concat a new comming one, 
//so the start will be the most earlier's, then we dont need to worry about the 
// coming one has earlier start time and break the rule.
class Solution{
	public class Interval {
		int start;
		int end;
		Interval(){
			start = 0;
			end = 0;
		}
		Interval(int s, int e){
			start = s;
			end = e;
		}
	}
	public minMeetingRoomsII(Interval[] intervals) {
		if(intervals.length == 0) return 0;
		PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(
			intervals.length,
			new Comparator<Integer>(){
				public int compare(Integer, a, Integer b){
					return a - b;
				}
			});
		Arrays.sort(
			intervals,
			new Comparator<Interval>(){
				public int compare(Interval a, Interval b){
					return a.start - b.start;
				}
			});
		allocator.add(intervals[0].end);
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i].start >= allocator.peek()){
				allocator.poll();
			}
			allocator.add(intervals[i].end);
		}
		return allocator.size();
	}
}

//solution two ## Chronological Ordering
class solution2{
	public int minMeetingRoomsII{

	}
}