/*
*	Prerequisites:
*		
*		max number in the array must be less than the number of entries 
*		eaxmple : number of entries : 8 , the max number must be 7 or less
*
*
*	How it works :
*	
*		if we satisfy the previous condition, we know that no entry wil be greater than number of entries,
*		so we can use modulo to get the max repeating number,but how ????
*		
*		we iterate through all entries and we use each entry as the key in the array and we add n, at the end
*		we search for the max 
*	
*	Example :
*		index	 0  1  2  3  4  5  6  7
*		Array = {2, 5, 5, 5, 3, 5, 1, 7}
*
*		Iteration 0 : array[2] = 13 (5 + 8)
*		Iteration 1 : array[5] = 13 (5 + 8)
*		Iteration 2 : array[5] = 21 (13 + 8) 
*		Iteration 3 : array[5] = 29 (21 + 8)
*		Iteration 4 : array[3] = 13 (5 + 8)
*		Iteration 5 : array[5] = 37 (29 + 8)
*		Iteration 6 : array[1] = 13 (5 + 8)
*		Iteration 7 : array[7] = 15 (7 + 8)
*		
*		Values in the array that is not modified :
*			
*			array[4] = 3
*			array[6] = 1
*			array[0] = 2
*		
*		
*		So, the max is 29 and the index is 5 => the max repeating number is 5
*		
*	Hint	
*		Because this algorithm change the array, you can get the original values just by using Modulo (%) on number of entries
*	
*		array[2] = 13 % 8 = 5
*		array[5] = 13 % 8 = 5
*		array[5] = 21 % 8 = 5
*		array[5] = 29 % 8 = 4
*		array[3] = 13 % 8 = 5
*		array[5] = 37 % 8 = 5
*		array[1] = 13 % 8 = 5
*		array[7] = 15 % 8 = 7
*		array[4] = 3
*		array[6] = 1
*	
*		the result array is : {2, 5, 5, 5, 3, 5, 1, 7} :D we got the same array as the original
*
*/
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
			//System.out.printf("Iteration %d : array[%d] = %d \n", i, array[i] % n,array[array[i] % n ]);
		}
		
		for(int i = 1; i < array.length; i++) {
			//System.out.printf("array[%d] = %d => %d \n", i, array[i], array[i] % n);
			if(maxRepeating < array[i]) {
				maxRepeating = array[i];
				maxRepeatingIndex = i;
				maxRepeatingValue = array[maxRepeatingIndex] % n;
			}
		}
		return maxRepeatingIndex;
	}
}