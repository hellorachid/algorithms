/*
*	implementation of Sieve of Eratosthenes algorithm : 
*		https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
*	
*/

public class SieveOfEratosthenes {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("Help :");
			System.out.println("	java SieveOfEratosthenes num");
			System.exit(-1);
		}
		String input = args[0];
		try {
			int num = Integer.parseInt(input);
			boolean[] primes = sieveOfEratosthenes(num);
			for (int i = 0; i < primes.length; i++) {
				if (primes[i]) {
					System.out.println(i);
				}
			}
		} catch(NumberFormatException nfe) {
			System.out.println("num is not a number");
		}

		

	}

	public static void init(boolean[] array) {
		array[0] = false;
		array[1] = false;
		for (int i = 2; i < array.length; i++) {
			array[i] = true;
		}
	}

	public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] array = new boolean[max + 1];
        int count = 0;
        
		init(array);  
        int n = 2;

        while (n <= Math.sqrt(max)) {
        	count++;        	
        	checkAllMultuples(n, array);
        	n = nextPrime(array, n);
        	if (n >= array.length) {
        		break;
        	}
        }
        
        return array;
	}

	
	public static void checkAllMultuples(int n, boolean[] array) {
		for (int i = n * n; i < array.length; i += n) {
			array[i] = false;
		}
	}

	public static int nextPrime(boolean[] array,int n) {
		int next = n + 1;
		while (next < array.length && !array[next]) {
			next++;
		}
		return next;
	}
}