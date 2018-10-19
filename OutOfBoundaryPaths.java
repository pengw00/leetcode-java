import java.util.*;
class OutOfBoundaryPaths{
	
	public static int findPaths(int m, int n, int N, int i, int j){
		if(i == m || j == n || i < 0 || j < 0) return 1;
		if(N==0) return 0;
		return findPaths(m,n, N-1,i-1,j)+ findPaths(m,n,N-1, i+1, j) + findPaths(m,n,N-1, i, j-1)+ 
		findPaths(m,n,N-1, i, j+1);
	}
	public static int findPaths2(int m, int n, int N, int i, int j) {
        int[][][] memo=new int[m][n][N+1];
        for(int[][] l:memo)
            for(int[] sl:l)
                Arrays.fill(sl,-1);
        return findPaths(m,n,N,i,j,memo);
    }
    public static int findPaths(int m, int n, int N, int i, int j,int[][][] memo) {
    	int M=1000000007;
        if(i==m || j==n || i<0 ||j<0)
            return 1;
        if(N==0)
            return 0;
        if(memo[i][j][N]>=0)
            return memo[i][j][N];
        memo[i][j][N]=((findPaths(m,n,N-1,i-1,j,memo)+findPaths(m,n,N-1,i+1,j,memo))%M+(findPaths(m,n,N-1,i,j-1,memo)+findPaths(m,n,N-1,i,j+1,memo))%M)%M;
        return memo[i][j][N];
    }
	public static void main(String[] args) {
		//test case
		int m = 6;
		int n = 6;
		int N = 3;
		int res = 0;
		long starttime = System.nanoTime();
		res = findPaths(m,n,N,3,3);
		long endtime = System.nanoTime();
		long runtime = endtime - starttime;
		System.out.println(res);
		System.out.println(runtime);
		long starttime2 = System.nanoTime();
		int res2 = findPaths2(m,n,N,3,3);
		long endtime2 = System.nanoTime();
		long runtime2 = endtime2 - starttime2;
		System.out.println(res2);
		System.out.println(runtime2);
		return;
	}
}