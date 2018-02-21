package expressive;

public class OverloadingExample {

	public static void show(Integer i){
		System.out.println("Integer value :" + i);
	}
	public static void show(String s){
		System.out.println("String value :" + s);
	}
	public static void main(String[] args) {
		
//		show(null); The method show(Integer) is ambiguous for the type OverloadingExample 
	}

}
