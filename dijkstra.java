public class dijkstra{
	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
		Stack<String> vals = new Stack<Double>();
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("("));
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals(")")) {
				String op = ops.pop();
				if(op.equals("+")) vals.push(vals.pop() + vals.pop());
				else if(op.equals("*")) vals.push(vals.pop()+vals.pop());
			}
			else vals.push(Double.parseDouble(s));
		}
		StdOut.printIn(vals.pop());
	}
}
