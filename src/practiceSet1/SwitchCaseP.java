package practiceSet1;

public class SwitchCaseP {
    int a=10;
   // SwitchCaseP selectN = new SwitchCaseP();
	meeta b = new meeta();

	public static String numberB(int b)
	{  int c = 0;
		switch (b)
		{
		case 10:System.out.println("its 10");break;
		case 20:System.out.println("its 10");break;
		default :System.out.println("its any");
		}
		return Integer.toString(b);
	}
	
	
}

class meeta{
	
	static String m="my";
	meeta(){
		m = "me";
	System.out.println(m);
	}
	
	static void hi(){
	System.out.println(m);	
	}
	
	
}