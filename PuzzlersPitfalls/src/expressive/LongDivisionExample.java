package expressive;

public class LongDivisionExample {

	public static void main(String[] args) {

		
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		
		/**
		 * What is answer ? expected 1000 ?
		 * But it prints 5. why?  
		 */
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		
		/**
		 * calculations of MICROS seconds per day returns int value not long
		 * And int value has limit
		 * 
		 * As per above expression MICROS_PER_DAY should be 86400000000
		 * But prints 500654080
		 */
		System.out.println("MICROS_PER_DAY :"+ MICROS_PER_DAY);
		System.out.println("MILLIS_PER_DAY :"+ MILLIS_PER_DAY);
		
		/**
		 * Solution : Use l or L as suffix in long value like:
		 *  final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000L;
		 */
	}

}
