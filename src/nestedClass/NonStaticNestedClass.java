package nestedClass;

public class NonStaticNestedClass {

	 static int a = 0;
	 
	class inner {
		 
		void innerMethod(){
			a =10;
			System.out.println("inner non static method of inner class");
		}
		
		
	}
	
	void outerMethod(){
		System.out.println("non static method of outer class");
	}
	
	static void outerMethodS(){
		System.out.println("static method of outer class");
	}
	
}
