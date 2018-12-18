public class MyIntegerStack{
	//ignore exception..
	private static final int CAP = 100;
	private static int cap;
	private static int top = -1;
	Integer[] stack;
	public MyIntegerStack(){
		this.cap = CAP;
		stack = new Integer[cap];
	}
	public boolean Empty(){ return top<0;}
	public int getSize(){
		if(Empty()) return 0;
		else return top+1;
	}
	public int peek(){
		if(Empty()) return -1;
		return stack[top];
	}
	public void push(int number){
		if(getSize()==CAP) return;
		top++;
		stack[top] = number;
	}
	public int pop(){
		if(Empty()) return -1;
		return stack[top--];
	}
	public static void main(String[] args) {
		MyIntegerStack mystack = new MyIntegerStack();
		System.out.println(mystack.Empty());
		mystack.push(1);
		mystack.push(5);
		mystack.push(6);
		System.out.println(mystack.Empty());
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		System.out.println(mystack.getSize());
	}
}