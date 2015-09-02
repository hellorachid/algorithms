/*
*	Queue is a linear structure which follows a particular order in which the operations are performed. 
*	The order is First In First Out (FIFO).  A good example of queue is any queue of consumers for 
*	a resource where the consumer that came first is served first.
*	
*	more info : https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
*/
public class QuickSort {

	public static void main(String args[]) {
		int[] array = new int[]{1, 10, 5, 7, 2, 4};
		quickSort(array, 0, array.length - 1);

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	public static void quickSort(int[] array, int start, int end) {
		if(start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int pp = start;

		for(int i = start; i < end; i++) {
			if(array[i] <= pivot) {
				swap(array, i, pp);
				pp++;
			}
		}
		swap(array, pp, end);
		return pp;
	}
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}