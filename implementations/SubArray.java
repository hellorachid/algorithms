import java.util.*;
public class SubArray {

	public static void main(String args[]) {
		int[] array1  = new int[]{1, 4, 20, 3, 10, 5};
		int[] array2 = new int[]{-5, 5, 5, -4};
		int[] array3 = new int[]{1, 1, 2, -3, 3, -3, 4};
		int[] array4 = new int[]{1, 4};

		int sum1 = 5; 
		int sum2 = 0; 
		int sum3 = 0; 
		int sum4 = 0;

		Range range1 = findSum(array1, sum1);
		Range range2 = findSum(array2, sum2);
		Range range3 = findSum(array3, sum3);
		Range range4 = findSum(array4, sum4);

		print(range1, sum1);
		print(range2, sum2);
		print(range3, sum3);
		print(range4, sum4);
		

	}

	public static void print(Range range, int sum) {
		if (range != null) {
			System.out.printf("sum of %d is from index %d to %d \n", sum, range.start, range.end);
		} else {
			System.out.printf("%d has no sum in the array \n", sum);
		}
	}

	public static Range findSum(int[] array, int sum) {
		int currentSum = array[0];
		int start = 0;

		for (int i = 1; i <= array.length; i++) {

			while (currentSum > sum && start < (i - 1)) {
				currentSum -= array[start];
				start++;
			}
			if (currentSum == sum) {
				return new Range(start, i - 1);
			}

			if (i < array.length) {
				currentSum += array[i];
			}
		}
		return null;
	}
}

class Range {
	public int start;
	public int end;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}
}