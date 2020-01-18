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
}