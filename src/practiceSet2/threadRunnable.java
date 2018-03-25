package practiceSet2;



class myThread1 implements Runnable{
	
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

class myThread3 implements Runnable{
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
public class threadRunnable {

	public static void main(String[] args) {
		myThread3 m = new myThread3();
		myThread1 m2 = new myThread1();
		Thread t = new Thread(m);
		Thread t1 = new Thread(m2);
		t.start();
		t1.start();

	}

}