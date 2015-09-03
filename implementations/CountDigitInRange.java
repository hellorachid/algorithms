/*
*
*	how it works :
*
*		we iterate through the array from 0 to given number, 
*		for every number :
*			we devide by 10 and check if the rest equal to the digit, repeating the task if the number is greater than 0
*
*
*	Example :
*		array : 0 , 1 , 2  
*		digit : 1
*		
*	Step 0 :
*		0 / 10 = 0
*		0 % 10 = 0 => 0 != 1 we do nothing
*	Step 1 :
*		1 / 10 = 0
*		1 % 10 = 1 => 1 == 1 we add one to variable count
*	Step 0 :
*		2 / 10 = 0
*		2 % 10 = 2 => 2 != 1 we do nothing
*	
*	Result : number of 1 in 0..2 is 1
*
*/
public class CountDigitInRange {

	public static void main(String args[]) {

		if(args.length != 2) {
			System.out.println("Help :");
			System.out.println("	java CountDigitInRange num digit");
			System.exit(-1);
		}
		String numString = args[0];
		String digitString = args[1];
		try {
			int num = Integer.parseInt(numString);
			int digit = Integer.parseInt(digitString);
			int result = countDigitInRange(num, digit);
			System.out.printf("number of %d in 0..%d is %d \n", digit, num, result);
		} catch(NumberFormatException nfe) {
			System.out.println("num or digit is not a number");
		}

	}

	public static int countDigitInRange(int max, int digit) {
		int count = 0;
		for(int i = 0; i <= max; i++) {
			int n = i;
			while(n > 0) {
				if(n % 10 == digit) {
					count++;
				}
				n = n / 10;
			}
		}
		return count;
	}

}