//solution one
class WordFilter {
	HashMap<String, Integer> map = new HashMap<>();
	public WordFilter(String[] words){
		for(int w = 0; w < words.length; w++){
			for(int i = 0; i <= 10 && i < words[w].length(); i++){
				for(int j = 0; j <= 10 && j <= words[w].length(); j++){
					map.put(words[w].substring(0, i) + "#" +  words[w].substring(words[w].length() - j), w);
				}
			}
		}
	}
	public int f( String prefix, String subfix){
		return (map.containsKey(prefix + "#" + subfix)) ? map.get(prefix + "#" + subfix) : -1;
	}
}