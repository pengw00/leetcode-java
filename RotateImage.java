/**pixel manipulation method
*/
public class RotateImage{
	public static void rotate(int[][] matrix){
		int r = matrix.length;
		int temp = 0;
		int mid = (int)r/2;
		for(int i = 0; i < r; i++){
			for(int j = 0; j < r; j++){
				temp = matrix[i][j];
				matrix[i][j]= matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int k = 0; k < mid; k++){
			for(int h = 0; h < mid; h++){
				matrix[k][h] = matrix[k][r-h-1];
				matrix[k][r-h-1] = temp;
			}
		}
	}
	public static void main(String[] args) {
	int[][] image1 = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(image1);
		for(int i = 0;i < image1.length;i++){
			for(int j = 0; j < image1.length; j++){
				System.out.println(image1[i][j]);
			}
		}
		System.out.println(image1);
	}
}