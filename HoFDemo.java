public interface IntUnaryFunction{
	int apply(int x);
}

public class tenX implements IntUnaryFunction{
	public int apply(int x){
		return 10*x;
	}
}

public class HoFDemo{
	public static int do_twice(IntUnaryFunction f, int x){
		return f.apply(f.apply(x));
	}
	public static void main(String[] args){
		System.out.println(do_twice(new tenX(), 2));
	}
}