public class MinimumWindowSubstring{
	public String MinimumWindowSubstring(String s, String t){
		if(s == null || t == null) || s.length() < t.length(){
			return "";
		}
		String result = "";
		int min = s.length() + 1;
		HashMap<Character, Integer> map5 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
		for(int i = 0; i < t.length(); i++){
			char item = t.charAt(i);
			if(!mapT.containsKey(item)){
				mapT.put(item,1);
			}else{
				mapT.put(item, mapT.get(item) + 1);
			}
		}
		int j = 0;
		for(int i = 0; i < s.length(); i++){
			while( j < s.length()){
				char item = s.charAt(j);
				if(!valid(map5, mapT)){
					if(!map5.containsKey(item)){
						map5.put(item, 1);
					}else{
						map5.put(item, map5.get(item) + 1);
					}
					j++;
				}else{
					break;
				}
			}
			if(valid(map5, mapT)){
				if(min > j - i){
					min = j -i;
					result = s.substring(i,j);
				}
			}
			char front = s.charAt(i);
			if(map5.get(front) == 1){
				map5.remove(front);
			}else{
				map5.put(front, map5.get(front) - 1);
			}
		}
		return result;
	}
	public boolean valid(HashMap<Character, Integer> map5, HashMap<Character, Integer> mapT){
		for(char item: mapT.keySet()){
			if(!map5.containsKey(item) || map5.get(item) < mapT.get(item)){
				return false;
			}
		}
		return true;
	}
}