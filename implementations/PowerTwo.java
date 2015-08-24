public class PowerTwo {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("Help :");
			System.out.println("	java PowerTwo num");
			System.exit(-1);
		}
		String input = args[0];
		try {
			int num = Integer.parseInt(input);
			boolean result = powerTwo(num);
			System.out.println(result);
		}catch(NumberFormatException nfe) {
			System.out.println("num is not a number");
		}
	}

	public static boolean powerTwo(int n) {
		return (n & (n - 1)) == 0;
	}
}