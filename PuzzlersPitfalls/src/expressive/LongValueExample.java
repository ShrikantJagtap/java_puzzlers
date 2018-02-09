package expressive;

public class LongValueExample {

	public static void main(String[] args) {

		/**
		 * What will be output of below statement?
		 * is that 66666?
		 * 
		 */
		System.out.println(12345 + 5432l); //17777
		
		/**
		 * See carefully above numbers. second number contains l(long) character.
		 * It's confusing right?
		 * Don't use l(long) for long integer. Use L(long) it removes confusion
		 */
		System.out.println(12345 + 5432L);//17777
	}

}
