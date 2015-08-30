/*
*	How it works :
*		An anagram is a type of word play, the result of rearranging the letters of a word or 
*		phrase to produce a new word or phrase, using all the original letters exactly once
*														https://en.wikipedia.org/wiki/Anagram	
*		
*		My implementation is based on the rule that if we replace every character by it's ascii code and add them 
*		we will get the same  result because addition is commutative
*		
*			
*/
public class SortAnagrams {

	public static void main(String args[]) {
		String[] array = new String[] {"abc", "cba",  "cbd", "cgf", "mab", "gab", "bca"};
		modifiedQuickSort(array, 0, array.length - 1);

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	public static void modifiedQuickSort(String[] array, int start, int end) {
		if(start < end) {
			int pivot = partition(array, start, end);
			modifiedQuickSort(array, start, pivot -1);
			modifiedQuickSort(array, pivot + 1, end);
		}
	}

	public static int partition(String[] array, int start, int end) {
		int pivot = hash(array[end]);
		int pp = start;
		for(int i = start; i < end; i++) {
			if( hash(array[i]) <= pivot) {
				swap(array, i, pp);
				pp++;
			}
		}
		swap(array, pp, end);
		return pp;
	}

	public static int hash(String s) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += s.charAt(i);
		}
		return sum;
	}

	public static void swap(String[] array, int a, int b) {
		String temp = array[a];
		array[a] = array[b];
		array [b] = temp;
	}
}