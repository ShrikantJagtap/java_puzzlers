package expressive;

import java.util.HashSet;
import java.util.Set;

public class ShortExample {

	public static void main(String[] args) {

		/**
		 * what will be the output below code?
		 * 
		 * is it 1?
		 * 
		 */
		Set<Short> set = new HashSet<Short>();
		for(short i=1; i<=100; i++){
			set.add(i);
			set.remove(i-1);
//			set.remove((short)(i-1));
		}
		System.out.println(set.size());
		
		/**
		 * You got size 100. How?
		 * Because arithmetic operations with byte and integer or short and integer
		 * always return integer value.
		 * So we need to type cast here from integer to short
		 * uncomment line line 20 and comment line 19 to get correct answer
		 */
		
	}

}
