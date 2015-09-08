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

		if (range1 != null) {
			System.out.printf("sum of %d is from index %d to %d \n", sum1, range1.start, range1.end);
		} else {
			System.out.printf("%d has no sum in the array \n", sum1);
		}

		if (range2 != null) {
			System.out.printf("sum of %d is from index %d to %d \n", sum2, range2.start, range2.end);
		} else {
			System.out.printf("%d has no sum in the array \n", sum2);
		}

		if (range3 != null) {
			System.out.printf("sum of %d is from index %d to %d \n", sum3, range3.start, range3.end);
		} else {
			System.out.printf("%d has no sum in the array \n", sum3);
		}

		if (range4 != null) {
			System.out.printf("sum of %d is from index %d to %d \n", sum4, range4.start, range4.end);
		} else {
			System.out.printf("%d has no sum in the array \n", sum4);
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