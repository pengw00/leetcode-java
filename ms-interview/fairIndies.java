public class fairIndies{
	
	public static int findFairIndies(int[] A, int[] B){
		int res = 0;
		int sumA = 0;
		int sumB = 0;
		for(int i = 0; i < A.length; i++){
			sumA += A[i];
			sumB += B[i];
		}
		int tmpA = 0;
		int tmpB = 0;
		for(int i = 0; i < A.length-1; i++){
			tmpA += A[i];
			tmpB += B[i];
			if(sumA == 2 * tmpA && sumB == 2*tmpB && tmpB==tmpA){
				res++;
			}
		}
		return res;
	}
	public static int findFairIndies2(int[] A, int[] B){
		int cnt = 0;
		int sumA = 0;
		int sumB = 0;
		for(int i = 0; i < A.length; i++){
			sumA += A[i];
			sumB += B[i];
		}
		int tmpA = A[0];
		int tmpB = B[0];
		for(int i = 1; i < A.length; i++){
			if(sumA == 2 * tmpA && sumB == 2*tmpB && tmpB==tmpA){
				cnt++;
			}
			tmpA += A[i];
			tmpB += B[i];
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] A1 = new int[]{ 4, -1, 0, 3};
		int[] B1 = new int[]{ -2, 5, 0, 3};
		int[] A2 = new int[]{ 2, -2, -3, 3};
		int[] B2 = new int[]{ 0, 0, 4, -4};
		
		System.out.println(findFairIndies2(A1,B1));
		System.out.println(findFairIndies2(A2,B2));
		System.out.println(findFairIndies(A1,B1));
		System.out.println(findFairIndies(A2,B2));
		// System.out.println(A1);
		// System.out.println(B1);
		// System.out.println(A2);
		// System.out.println(B2);
	}
}