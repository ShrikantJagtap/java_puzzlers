package expressive;

public class SwappingExample {

	public static void main(String[] args) {

		/**
		 * Below code works in c/c++ perfect.
		 * But in java, what will output? 
		 */
		int x = 1984;
		int y = 2001;
		x^= y ^= x ^=y;
		System.out.println("x=" + x + " y="+ y);//x=0 y=1984
		
		/**
		 * In java, operands of operators are evaluated from left to right.
		 * It is not recommended use one variable in multiple times in expression
		 */
		
	}

}
