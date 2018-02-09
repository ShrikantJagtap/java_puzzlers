package expressive;

public class OddityExample {

	/**
	 *
	 * This method check given number is odd or not.
	 * It takes integer value
	 * Integer value has half of negative integer and half of positive integers.
	 * 
	 * @param i - Integer value
	 * @return boolean
	 */
	public static boolean isOdd(int i){
		/**
		 * This statement is not perfect odd checker.
		 * Because it will work only for positive odd numbers.
		 * And fails all negative odd integers
		 */
//		return i%2==1; 
		
		/**
		 * This statement is perfect odd checker
		 */
//		return i%2!=0; // this will work all integer numbers
		
		/**
		 * We can also use bitwise operator to check odd number
		 * But this is faster than previous choice
		 */
		return (i & 1)!=0;
	}
	public static void main(String[] args) {

		System.out.println("is -5 odd ? :" + isOdd(-5));
		System.out.println("is -3 odd ? :" + isOdd(-3));
		System.out.println("is 5 odd ? :" + isOdd(5));
		System.out.println("is 4 odd ? :" + isOdd(4));
	}

}
