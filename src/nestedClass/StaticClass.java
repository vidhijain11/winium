package nestedClass;
public class StaticClass {

	public static void main(String[] args) {
		
		outer objOuter = new outer();           //outer not static method is called by object of outer class
		objOuter.outerMethod();
		
		outer.outerMethodS(); 				   //outer static method is called directly by outer class name
		outer.inner.innerMethodS();            //inner static method is called directly by inner class name
		
		outer.inner objInner = new outer.inner();
		objInner.innerMethod();                //inner non static method is called by object of inner class	
		
		outer.inner.inner2.inner2MethodS();    //inner 2 class static method
		
	}

}

class outer {

	static int ois = 10;
	int oj = 11;
	private static int outerPrivateS= 0;
	
	static class inner {

		
		void innerMethod (){
			ois++;
			outerPrivateS++;                   //inner static class can access private static data member of outer class
			System.out.println("inner non static mehtod" + ois);

		}
		
		static void innerMethodS (){
			System.out.println("inner static mehtod" + ois);
		}
		
		static class inner2 {
			static void inner2MethodS (){
				System.out.println("inner2 static mehtod" + ois);
			}
		}
	}

	static void outerMethodS(){

		System.out.println("static outer method");
	}
	void outerMethod(){

		System.out.println("non static inner method");
	}


}