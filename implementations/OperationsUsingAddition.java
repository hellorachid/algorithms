public class OperationsUsingAddition {

	public static void main(String args[]) {
		
		System.out.println(multiply(1, 0));
		System.out.println(substract(0, 5));
		System.out.println(devide(5, 0));
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
			return -1;
		}
		while (a >= b) {
			a = substract(a, b);
			index++;
		}
		return index;
	}
}