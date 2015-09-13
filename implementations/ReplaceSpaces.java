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