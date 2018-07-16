/*
Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
Output: True
Explanation:
We can transform start to end following these steps:
RXXLRXRXL ->
XRXLRXRXL ->
XRLXRXRXL ->
XRLXXRRXL ->
XRLXXRRLX
Notes: the position R and L in start and end  without is  always equals, 
and the relative position of R is always <= at end, the similar as L, 
so only one pass from left to right, check the condition
Notes2: solution2 is count, in start: if R, r++, then in end, if R, r--, 
then at every position if r==0, the same as L.
Dog followup: 如果LR只能轮流走，r先走，直到有一方不能走
*/
public class lc777{
	public static boolean canTransform(String start, String end){
		if(!start.replace("X", "").equals(end.replace("X", "")))
			return false;
	    int p1 = 0, p2 = 0;
	    while(p1 < start.length()){
	    	while(p1 < start.length() && start.charAt(p1) == 'X'){
	    		p1++;
	    	}
	    	while(p2 < end.length() && end.charAt(p2) == 'X'){
	    		p2++;
	    	}
	    	if(p1 == start.length() || p2 == end.length()){
	    		return true;
	    	}
	    	if(start.charAt(p1) == 'L' && p2 > p1){
	    		return false;
	    	}
	    	if(end.charAt(p2) == 'R' && p1 > p2){
	    		return false;
	    	}
	    	p1++;
	    	p2++;
	    }
	    return true;
	}
	public static void main(String[] args) {
		String start = "RXXLRXRXL", end = "XRLXXRRLX";
		System.out.println(canTransform(start, end));
	}
}