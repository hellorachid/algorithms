public class PrimesTable {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("Help :");
			System.out.println("	java PrimesTable num");
			System.exit(-1);
		}
		String input = args[0];
		try {
			int num = Integer.parseInt(input);
			for (int i = 2; i < num; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		} catch(NumberFormatException nfe) {
			System.out.println("num is not a number");
		}
	}

	public static boolean isPrime(int n) {
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}	
}