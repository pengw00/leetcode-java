public class IntegerToRoman2{
	public static void main(String[] args){
		int i = 1989;
		System.out.println(IntegerToString(i));
	}

	public static String IntegerToString(int num){
		StringBuilder romanNumberBuilder = new StringBuilder();
		int x = num;
		while(x >0){
			if(x < 4){
				x = x -1;
				romanNumberBuilder.append("I");
			}
			else if (x == 4){
				romanNumberBuilder.append("IV");
				x = x - 4;
			}
			else if(x < 9){
				romanNumberBuilder.append("V");
				x = x -5;
			}else if(x < 40){
				romanNumberBuilder.append("X");
				x -=10;
			}else if(x < 50){
				romanNumberBuilder.append("XL");
				x -=40;
			}else if(x < 90){
				romanNumberBuilder.append("CD");
				x -= 400;
			}else if(x < 100){
				romanNumberBuilder.append("XC");
				x -= 90;
			}else if(x < 400){
				romanNumberBuilder.append("C");
				x -= 100;
			}else if(x < 500){
				romanNumberBuilder.append("CD");
				x -= 400;
			}else if(x < 900){
				romanNumberBuilder.append("D");
				x -= 500;
			}else if(x < 1000){
				romanNumberBuilder.append("CM");
				x -= 900;
			}else{
				romanNumberBuilder.append("M");
				x -= 1000;
			}
		}
		return romanNumberBuilder.toString();
	}
}