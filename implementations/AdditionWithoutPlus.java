/*
*	how it works :
* 		We can add two number in binary by adding every  bit from right to left and save carry to the next bit
*		example :
*                    001       <- carry
*                    1001 (9)  <- a
*                  + 0001 (1)  <- b
*                    ----
*                    1010 (10) <- sum
*
*     in  Binary we can add two numbers without carry using XOR (^) operator, 
*     we need also carry,so we use and (&) operator, because carry can be 1 if the two bits at the specific position are set to one
*
*     example  :
*
* 	  a = 101(5), b = 100(4)
*
*    step 1 : 
*       	sum 	=  101 XOR 100 -> 001 (1)                
*           carry   =  101 AND 100 -> 100 (4) << 1 -> 1000 (8)          
*                       
*    step 2 :                   
*            sum 	= 001 XOR 1000 -> 1001 (9)           
*            carry  = 001 AND 1000 -> 0000 << 1 -> 0000 (0)         
*                       
*    step 3 :                  
*            return a 1001 (9)           
*                       
*/
public class AdditionWithoutPlus {

	public static void main(String rags[]) {
		int a = 5;
		int b = 4;
		int result = additionWithoutPlus(5, 4);
		System.out.printf("sum of %d + %d =  %d \n", a, b, result);

	}

	
	public static int additionWithoutPlus(int a, int b) {
		if(b == 0) return a;

		int sum = a ^ b;
		int carry = (a & b) << 1;

		return additionWithoutPlus(sum,carry); 
	}
}