/*
*	Problem :
*		we have a given string with spaces, we want to change every space with %20
*		we consider that the string have enough space at the end and the given length
*		consider just the string 
*	example :	
*		String : "Mr John Smith    "
*							  |
*							length
*		length : 13 - 1 because we begin at index 0
*
*		
*	How it works :
*		first, we consider that we have enough space at the end of the string to fill %20, 
*		the length of the string not include this spaces
*		we calculate the last index by the formulat : length of the string + number of spaces * 2
*		( because %20 is 3 chars, we have already one from the space in the string and 2 from 
*		the spaces in the string that is not considered :D )
*		we commence from the string lengh index and we shift the values to the last index
*		if we find a space we add %20 and we continue
*/

public class ReplaceSpaces {

	public static void main( String args[] ) {
			char str[] = "Mr John Smith    ".toCharArray();
			int lengthWithoutSpaces = 13 - 1; // we count from 0
			replaceSpaces(str, lengthWithoutSpaces);
			String s = new String(str);
			System.out.printf("%s \n", s);
	}

	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0;
		int index;
		int i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = length + (spaceCount * 2);
		str[index] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
}