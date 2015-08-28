public class AdditionWithoutPlus {

	public static void main(String rags[]) {
		int a = 5;
		int b = 4;
		int result = additionWithoutPlus(5, 4);
		System.out.printf("sum of %d + %d =  %d \n", a, b, result);

	}

	public static int additionWithoutPlus(int a, int b) {
		if(b == 0) return a;

		int sum = a ^ b;
		int carry = (a & b) << 1;

		return additionWithoutPlus(sum,carry);
	}
}