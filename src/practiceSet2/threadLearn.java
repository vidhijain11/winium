package practiceSet2;

public class threadLearn {

	public static void main(String[] args) {
		myThread m = new myThread();
		myThread2 m2 = new myThread2();
		m.start();
		m2.start();

	}

}

class myThread extends Thread{
	
	public void run(){
		int a[] = new int[11];
	for (int i=0;i<=10;i++)
	{
		a[i]=i;
		System.out.println(a[i]);
		try {Thread.sleep(10);} catch ( Exception e){};;
	}
	}
}

class myThread2 extends Thread{
	 public void run(){
		 int a[] = new int[11];
			for (int i=0;i<10;i++)
			{
				a[i]=i+11;
				System.out.println(a[i]);
				try {Thread.sleep(10);} catch ( Exception e){};;
			}
	 }
}