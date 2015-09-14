/*
*	Problem :
*		We have two sorted lists, one of them have enough space at th end to fill the second one
*		we want to sort them in the first array
*	example :
*		a = {1, 3, 4, 10, 20, 0, 0, 0};
*		b = {2, 6, 7};
*		result : a = {1, 2, 3, 4, 6, 7, 10, 20}
*		
*		
*/
public class MergeTwoSortedLists {

	public static void main(String args[]) {
		int[] arrayA = new int[]{1, 3, 4, 10, 20, 0, 0, 0};
		int[] arrayB = new int[]{2, 6, 7};

		merge(arrayA, arrayB);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.printf("%d ", arrayA[i]);
		}
	}

	public static void merge(int[] arrayA, int[] arrayB) {


		int[] helper = new int[arrayA.length];
		int m = arrayA.length - arrayB.length;

		for (int i = (arrayA.length - 1); i >= m; i--) {
			arrayA[i] = arrayB[i - m];
		}

		for (int i = 0; i < arrayA.length; i++) {
			helper[i] = arrayA[i];
		}

		int left = 0;
		int diff = m -1;
		int right = m;
		int high = arrayA.length -1;
		int current = 0;
		while (left <= diff && right <= high) {
			if (helper[left] <= helper[right]) {
				arrayA[current] = helper[left];
				left++;
			} else {
				arrayA[current] = helper[right];
				right++;
			}
			current++;
		}
		int remindingLeft = diff - left;
		for (int i = 0; i <= remindingLeft; i++) {
			arrayA[current + i] = helper[left + i];
		}

		int remindingRight = high - right;
		for (int i=0; i <= remindingRight; i++) {
			arrayA[current + i] = helper[right + i];
		}


	}
}