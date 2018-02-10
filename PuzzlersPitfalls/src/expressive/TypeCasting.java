package expressive;

public class TypeCasting {

	public static void main(String[] args) {

		/**
		 * What will be output of below statement?
		 * is it -5 ?
		 */
		System.out.println((int)(char)(byte)-5); // 65531
		
		
		/**
		 * Below statement will give exact type casting result
		 */
		System.out.println((int)(short)(char)(byte)-5);//-5
	}

}
