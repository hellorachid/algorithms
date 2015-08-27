public class BinarySearch {

	public static void main(String args[]) {

		int[] array = new int[]{-1, 5, 6, 7, 10};
		int num =  5;
		int pos = binarySearchRecursive(array, num, 0, array.length - 1);
		if(pos == -1){
			System.out.println("Position not found");	
		}else {
			System.out.println("position : "+pos);
		}
		
	}

	public static int binarySearchRecursive(int[] array,int a, int low, int hight) {
		if(low > hight) return -1;
		int middle = (low + hight) / 2;
		if(array[middle] > a) {
			return binarySearchRecursive(array, a, low, middle -1);
		} else if(array[middle] < a) {
			return binarySearchRecursive(array, a, middle + 1, hight);
		}else {
			return middle;
		}

	}
}