package expressive;

public class ConcatCharExample {

	public static void main(String[] args) {
		/**
		 * What will be output code?
		 * 
		 */
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
		
		/**
		 * output will be:
		 * Ha
		 * 169
		 * 
		 * Because character auto promoted into int value
		 * and arithmetic operation on character considered as integer
		 */
	}

}
