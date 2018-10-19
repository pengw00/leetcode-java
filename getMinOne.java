//google OA getMinOne: give a matrix contains only one or zero, exvery time click on 1, all the other one in the 
//row and column will become zero. return the least click.
class getMinOne{
	public int getMinOne(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] board = new int[m][n];
		int[] res = new int[1];
		res[0] = Integer.MAX_value;
		helper(matrix, board, 0, 0, res);
		return res[0];
	}
	private void helper(int[][] matrix, int[][] board, int row, int[] res){
		if(row == matrix.length){
			res[0] = Math.min(res[0], count);
			return;
		}
		boolean hasValidOne = false;
		for(int j =0; j < board[0].length; j++){
			if(matrix[row][i] == 1 && isValid(board, row, j)){
				hasValidOne = true;
				board[row][j] = 1;
				helper(matrix, board, row+1, count+1, res);
				board[row][j] = 0;
			}
		}
		if(!hasValidOne){
			helper(matrix, board, row+1, count, res);
		}
	}
	private boolean isValid(int[][] board, int row, int j){
		for(int i = row-1; i >= 0; i--){
			if(board[i][j] == 1){
				return false;
			}
		}
		return true;
	}
}