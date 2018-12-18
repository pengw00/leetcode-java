public class products{
	public int[] product(int[] inputs){
		int[] res = new int[inputs.length];
		int len = inputs.length;
		//right
		res[len-1] = 1;
		for(int i = len-2; i >= 0; i--){
			res[i] = res[i+1] * inputs[i+1];
		}
		int left = 1;
		for(int j = 0; j < len; j++){
			res[j] = left * res[j];
			left = left * inputs[j];
		}
		return res;
	}
	public static void main(String[] args) {
		int[] inputs = {1, 2, 3, 4, 5, 6};
		products newpro = new products();
		int[] res = newpro.product(inputs);
		for(int i = 0; i < inputs.length; i++){
			System.out.println(res[i]);
		}
		
	}
}