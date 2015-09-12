/*
*	Problem : 
*		Given an infinite number of quarters (25 cents), dimes (10 cents), 
*		nickels (5 cents) and pennies (1 cent), write code to calculate 
*		the number of ways of representing n cents.
*	
*	source :  ￼CRACKING THE CODING INTERVIEW, FIFTH EDITION, page 329
*/
public class MakeChange {

	public static int makeChange(int n, int denom) {
		int next_denom = 0;
		switch (denom) {
			case 25:
				next_denom= 10;
				break; 
			case 10:
				next_denom = 5;
				break; 
			case 5:
				next_denom = 1;
				break;
			case 1:
				return 1;
		} 

		int ways = 0;
		for (int i =0; (i * denom) <= n; i++) {
			ways += makeChange(n - (i * denom), next_denom);
		}
 		return ways; 
 	}
 	public static void main(String[] args) {
 		int cents = 100;
 		int denom = 25;
 		System.out.printf("there are %d ways to represent %d cent(s)", makeChange(cents, denom), cents);
 	}
}
