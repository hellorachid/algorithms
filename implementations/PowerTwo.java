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
	/*
	* how this method works : 
	*   - we know that if a number is a power of 2 we have one bit set to 1 and the others are in 0
	*            example :  00010 -> 2
	*            example :  00100 -> 4
	*            example :  01000 -> 8
	*            example :  10000 -> 16
	*     
	*   -  if we substruct one from this number we will have all  bits in the right set to 1
	*        8 ( 1000) - 1 ( 0001) = 7 ( 0111)
	*
	*   - if we use loigical and between n and n-1 we get a number  0 ( if the number is power of two) or other thing if it's not
	*       example : use logical and (&) 
	*                         1000 (8)             1001 (9)         
	*                         0111 (7)             1000 (8)
	*                         ----                 ----
	*                         0000 (0)             1000 (8)
	*/
	public static boolean powerTwo(int n) {
		return (n & (n - 1)) == 0;
	}
}