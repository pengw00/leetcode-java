// ontest 168 weekly

//** Question 3: Maximum Number of Occurrences of a Substring
//Given a string s, return the maximum number of ocurrences of any substring under the following rules:

// The number of unique characters in the substring must be less than or equal to maxLetters.
// The substring size must be between minSize and maxSize inclusive.

// Got a new technique from uwi's solution, he use the bitwise to deal with the duplicate substring, 
// while I am struggling in the constest with set(space and time heavily).
// notes: bitwise inclusive operater means if both bit is 0, it will be 0, otherwise it will be 1, 
// like |=,  when  10 | 01 = 11, if 11 || 00 = 11. In the solution, uwi use shift << to transfter 
// different char, like  1<<a = 2, 1<<b, every char will in its own position.  and if there are two a
// it will be two 10, and it still be 10.

// uwi's solution is really straight forward
class solution {
	public int maxFreq(String s, int maxLetters, int minSize, int maxSize){
		int n = s.length();
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			for(int j = minSize; j <= maxSize && i+j<=n; j++){
				String subs = s.substring(i, i+j);
				int f = 0; //init a number for the substring
				for(char c: ss.toCharArray()){
					f |= 1<<c; // every char will be in his own position
				}
			}
			if(Integer.bitCount(f) <= maxLetters){
				if(!map.containsKey(subs)){
					map.put(subs, 1);
				}else{
					map.put(subs, map.get(ss)+1);
				}
			}else{
				break; // break the second level
			}
		}
		int ret = 0;
		for(int c: map.values()){
			res = Math.max(ret, v);
		}
		return ret;
	}
}
