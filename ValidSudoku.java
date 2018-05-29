public boolean isValidSudoku(char[][] board){
	Map<Integer, Set<Character>> row = new HashMap<>();
	Map<Integer, Set<Character>> col = new HashMap<>();
	Map<Integer, Set<Character>> box = new HashMap<>();
	for(int i = 0; i < 9; i++){
		for(int j = 0; j < 9; j++){
			if(board[i][j] != '.'){
				if(row.containsKey(i)){
					if(row.get(i).containsKey(board[i][j])){
						return false;
					}
					row.get(i).add(board[i][j]);
				}else{
					row.put(i, new HashSet<Character>());
					row.get(i).add(board[i][j]);
				}
				if(col.containsKey(j)){
					if(col.get(j).contains(board[i][j])){
						return false;
					}
					col.get(j).add(board[i][j]);
				}else{
					col.put(j, new HashSet<Character>());
					col.get(j).add(board[i][j]);
				}
				int boxNum = (i/3)*3 + j/3;
				if(box.containsKey(boxNum)){
					if(box.get(boxNum).contains(borad[i][j])){
						return false;
					}
					box.get(boxNum).add(board[i][j]);
				}
				else{
					box.put(boxNum, new HashSet<Character>());
					box.get(boxNum).add(borad[i][j]);
				}

			}
		}
	}
	return true;
}