import java.util.ArrayList;
import java.util.HashMap;
import java.util;
class GroupAnagram{
	public List<List<String>> GroupAnagram(String[] strs){
		if(strs.length == 0) return new ArrayList();
		Map<String, List> ans =  new HashMap<String, List>();
		for(String s: strs){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
	public static void main(String[] args) {
		String[] str1 = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List> ans =  new HashMap<String, List>();
		for(String s: str1){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			System.out.println(ca);
			String key = String.valueOf(ca);
			if(!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
	}
}