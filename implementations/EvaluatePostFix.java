import java.util.Stack;
public class EvaluatePostFix {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("Help :");
			System.out.println("	java EvaluatePostFix Exp");
			System.exit(-1);
		}
		String input = args[0];
		int result = evaluatePostFix(input);
		System.out.println(result);
	}

	public static int evaluatePostFix(String exp) {
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i); 
			if(c == '*' || c == '+' || c == '-'){
				int op2 = stack.pop();
				int op1 = stack.pop();
				if(c == '*') {
					stack.push(op1 * op2);
				} else if(c == '+') {
					stack.push(op1 + op2);
				} else if(c == '-') {
					stack.push(op1 - op2);
				}
			} else {
				int d =  exp.charAt(i) - '0'; 
				stack.push(d);
			}
		}
		return stack.pop();
	}
}