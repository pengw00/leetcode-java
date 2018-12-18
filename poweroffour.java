public class poweroffour{
	public boolean ispowerfour(int input){
		if(input==0) return false;
		if(input%4 != 0) return input==1;
		return ispowerfour(input/4);
	}
	public static void main(String[] args) {
		int input = 16;
		poweroffour newpro = new poweroffour();
		boolean res = newpro.ispowerfour(input);
		System.out.println(res);
		
	}
}