/*
*
*	How it works :
*		https://en.wikipedia.org/wiki/Merge_sort
*
*/

public class MergeSort {

	public static void main(String args[]) {
		int[] array = new int[]{4, 3, -2, 1, 0};
		int[] helper = new int[array.length];

		mergeSort(array, helper, 0, array.length -1);

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	public static void mergeSort(int[] array, int[] helper, int low, int hight) {
		if(low < hight) {
			int middle = (low + hight) / 2;
			mergeSort(array, helper, low, middle);
			mergeSort(array, helper, middle + 1, hight);
			merge(array, helper, low, middle, hight);
		}
	}

	public static void merge(int[] array, int[] helper, int low, int middle, int hight) {

		for(int i = low; i <= hight; i++) {
			helper[i] = array[i];
		}

		int left = low;
		int right = middle + 1;
		int current = low;

		while((left <= middle) && (right <= hight)) {
			if(helper[left] <= helper[right]) {
				array[current] = helper[left];
				left++;
			} else {
				array[current] = helper[right];
				right++;
			}
			current++;
		}

		int reminding = middle - left;
		for(int i = 0; i <= reminding; i++) {
			array[current + i] = helper[left + i];
		}

	}
}