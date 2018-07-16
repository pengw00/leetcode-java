public static int countNumbersWithUniqueDigits(int n){
	if(n > 10){
		return countNumbersWithUniqueDigits(10);
	}
	int count = 1;
	long max = (long) Math.pow(10,n);

	boolean[] used = new boolean[10];
	for(int i = 1; i < 10; i++){
		used[i] = true;
		count += helper(i, max, used);
		used[i] = false;
	}

	private static int helper(long prev, long max, boolean[] used){
		int count = 0;
		//eliminate condition
		if(prev < max){
			count += 1
		}else{
			return count;
		}
		for(int i = 0; i < 10; i++){
			if(!used[i]){ //check if the digit has been used, eg: prev = 1, i = 0, used[0] = true
				long cur = 10 * prev + i;
				count += helper(cur, max, used);
				used[i] = false;// backtracking first in then track and out
			}
		}
		return count;
	}
}