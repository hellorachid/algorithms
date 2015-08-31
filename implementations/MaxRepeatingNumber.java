public class MaxRepeatingNumber {
	
	public static void main(String[] args) {
		int[] array = new int[] {2, 5, 5, 5, 3, 5, 1, 7};
		int result = findRepeating(array, array.length);
		System.out.println(result);
	}
	public static int findRepeating(int[] array, int n) {
		int maxRepeating = array[0];
		int maxRepeatingValue = -1;
		int maxRepeatingIndex = 0;
		for(int i = 0; i < array.length; i++) {
			array[array[i] % n ] += n;
		}
		
		for(int i = 1; i < array.length; i++) {
			if(maxRepeating < array[i]) {
				maxRepeating = array[i];
				maxRepeatingIndex = i;
				maxRepeatingValue = array[maxRepeatingIndex] % n;
			}
		}
		return maxRepeatingIndex;
	}
}