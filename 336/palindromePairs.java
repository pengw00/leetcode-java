class solution {
	//sub class: trie
	class TrieNode {
		TreeNode[] next;
		int index;
		List<Integer> list;

		//contructor
		TrieNode() {
			next = new TrieNode[26];
			index = -1;
			// list for store a list of possible palindrome parts for words
			list = new ArrayList<>();
		}
	} 

	public List<List<Integer>> palindromePairs( String[] words){
		List<List<Integer>> res = new ArrayList<>();
		TrieNode root = new TrieNode();

		for(int i = 0; i < words.length; i++){
			addWord(root, words[i], i);
		}

		for(int i = 0; i < words.length; i++){
			search(words, i, root, res);
		}
		return res;
	}

	private void addWord(TrieNode root, String word, int index){
		for(int i = word.length()-1; i >= 0; i--){
			int j = word.charAt(i) - 'a';
				if(root.next[j] == null) {
					root.next[j] == new TrieNode();
				}
				if(isPalindrome(word, 0, i)){
					// this is for later searching at the end
					//of the word, if the word ending at a TrieNode of list,
					// we known that words can pair a list of other words
					root.list.add(index);
				}
				//go to next
				root = root.next[j];
		}
		root.list.add(index);
		root.index = index;
	}

	private void search(String[] words, int i, TrieNode root, List<List<Integer>> res){
		//search from beginnin to ending of the word, because 
		//we want to know at the end of word, if we have a list of index, if there are
		//indexes in there, it tell that there are that words that can pair(the beggining of the words is palindrome)
		for(int j = 0; j < words[i].length(); j++){
			//first pair other whole words, the whole word, right, the whole other word  pair with part of itself
			//not part of it(root's index not -1) and not itself
			if(root.index >= 0 && root.index != i && isPalindrome(words[i], j, words[i].length()-1)){
				//so this is the other whole word with part of the current word
				res.add(Arrays.asList(i, root.index));
			}
			root = root.next[words[i].charAt(j)-'a'];
			//if no child node, ending
			if(root == null) return;
		}
		//and  at last we need to pair the whole current word with parts of other words
		for(int j: root.list){
			if(i==j) continue; // with itself
			res.add(Arrays.asList(i, j));
		}
	}

	// ispalindome function
	private boolean isPalindrome(String word, int i, int j){
		while(i < j){
			if(word.charAt(i++) != word.charAt(j--)) return false;
		}
		return true;
	}
}