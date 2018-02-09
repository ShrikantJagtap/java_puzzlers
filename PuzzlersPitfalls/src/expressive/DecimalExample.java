package expressive;

import java.math.BigDecimal;

public class DecimalExample {

	public static void main(String[] args) {

		/**
		 * What will output of following statement?
		 * 0.90 ?
		 * It will return 0.8999999999999999 rather than 0.90
		 * Because it performs double value subtraction
		 */
		System.out.println(2.00 - 1.10);
		
		/**
		 * Solution for this problems are :
		 * use printf("%.2f") But it is poor not perfect
		 * 
		 */
		System.out.printf("%.2f%n", (2.00-1.10));
		
		/**
		 * Use BigDecimal class
		 * Don't use BigDecimal(Double) constructor
		 * Use BigDecimal(String) constructor
		 */
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
		/**
		 * Note : If you want exact answer then use int, long and BigDecimal.
		 */
	}

}
