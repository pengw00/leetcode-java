//暴力解法，

//bitmanipulation的暴力解法，可以达到优化空间的方法。
// 思路： 建一个dp保存初始化数据为0，bit操作后把所有的组合转化成数字存在dp的集合里，继续往
// 下一个扫的字母如果和dp集里面的字母可以达到重合，那么就加入dp集合里，同时判断是否是最长
//利用的java的功能函数有bitCount，和 &， | 还有 位移操作 1<< c-'a';
class solution{
	public static void public static void main(String[] args) {
		//test case1
		String[] demo1 = new String[]{"abs", "dfg", "bgf", "rty", "oiu"};
		System.out.println(maxLength(demo1));
	}
	//bit set, similar to subset level by level
	public static int maxLength(String[] A){
		List<Integer> map = new ArrayList<>();
		dp.add(0);
		int res = 0; //save the res any time
		for(String s: A){
			int a  = 0; //记录string的位移大小
			int dup = 0; //判断是否重复
			for(char c: s.toCharArray()){
				a |= 1 << c;
				dup &= 1 << c;
			}
			if(dup>0) continue;
			//no dup, then we make intersect
			for(int item: map){
				if(item & a > 0) continue; //中间有重合的字符那么跳过
				map.add(item | a); //add the combo of both number
				res = Math.max(res, Integer.bitCount(item || a));
			}
		}
		return res;
	}
	//backtrack
	int max = 0;
	public static int MaxLenBacktrack(String[] input){
		int[] count = new int[256];
		backtrack(input, count, 0, "");
		return max;
	}
	private static void backtrack(String[] input, int count, int index, String str){
		if(index==input.length) return;
		for(int i = index; i < arr.size(); i++){
			char[] array = arr.get(i).toCharArray();
			boolean dup = false;
			for(int k = 0; k < array.length; k++){
				char c = array[k];
				if(count[(int)c] == 1){
					for(int j = 0; j < k; j++){
						count[(int)(array[j])]--;
					}
					dup = true;
					break;
				}
				count[(int)c]++;
			}
			if(!dup){
				max = Math.max(max, str.length() + array.length);
				backtrack(input, count, i+1, str+input.get(i));
				for(char c: array){
					count[(int)c]--;
				}
			}
		}
	}
}