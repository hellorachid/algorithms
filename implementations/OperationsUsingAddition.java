/*
*	How it works :
*		substracttion :  
*			we can use addition to do substraction using two's complement, 
*			a - b  ==> a + (two's complement of b) ==> a + ~b
*			(we use two's complement to get the negative of a number)
*
*		multiplication :
*			we add number a  b time
*			a = 2, b = 3 => 2 + 2 + 2
*
*		division :
*			we substract b from a until we get a number smaller than b and we count the number of times
*			a = 8, b = 3
*           Steps :
*				8 - 3 = 5  | index = 1
*				5 - 3 = 2  | index = 2
*				2 < 3 so we stop 
*				we return 2
*
*
*/

public class OperationsUsingAddition {

	public static void main(String args[]) {
		
		System.out.printf(" %d * %d = %d \n", 1, 0, multiply(1, 0));
		System.out.printf(" %d - %d = %d \n", 0, 5, substract(0, 5));
		System.out.printf(" %d / %d = %d \n", 5, 0, devide(5, 0));
		System.out.printf(" %d / %d = %d \n", 8, 3, devide(8, 3));
	}

	public static int multiply(int a, int b) {
		boolean isBNegative =false ;
		int result = a;
		if (a == 0 || b == 0) {
			return 0;	
		} 
		if (b < 0) {
			isBNegative = true;
			b = ~b + 1;
		} 
		for (int i = 1; i < b; i++) {
			result += a;
		}
		if (isBNegative) {
			result = ~result + 1;
		}
		return result;
	} 

	public static int substract(int a, int b) {
		int comp2B = ~b + 1;
		return a + comp2B;
	}

	public static int devide(int a, int b) {
		int index = 0;
		if (b == 0) {
			// -1 means that 
			return -1;
		}
		while (a >= b) {
			a = substract(a, b);
			index++;
		}
		return index;
	}
}