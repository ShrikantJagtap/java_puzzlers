public class Indecisive{
	public static void main(String[] args){
		/*
		 * What will return this statement?
		 */
		System.out.println(decision());
	}
	static boolean decision(){
		try{
			return true;
		}finally{
			return false;
		}
	}
}

