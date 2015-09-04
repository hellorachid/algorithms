/*
*	How it works :
*		
*		we try to add the character in the HashSet if it return false, 
*		that means  the character is exist and it's a duplicate so we return false
*		At the end we return true (all characters are unique)
*
*/
import java.util.*;
public class UniqueString {
	
	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("Help :");
			System.out.println("	java UniqueString string");
			System.exit(-1);
		}
		String input = args[0];
		boolean result = isUnique(input);
		if(result) {
			System.out.printf("%s  is unique", input);
		} else {
			System.out.printf("%s is not unique", input);
		}
	}

	public static boolean isUnique(String line) {
		HashSet<Character> chars = new HashSet<Character>();
		for(int i = 0; i < line.length(); i++) {
			if(!chars.add(line.charAt(i))) {
				return false;
			}		
		}
		return true;
	}
}