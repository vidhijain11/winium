package practiceSet1;

import java.util.Scanner;

public class StaticBlock {
	 
	static int H;
	static int B;
	static boolean flag = true;
	static { 
		Scanner sc = new Scanner (System.in);
		B = sc.nextInt();
	    H = sc.nextInt();
			if (B<=0 || H <=0){
			flag = false;
			try {
			throw new Exception("Breadth and height must be positive");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		} }
	public static void main(String[] args) {
    
    if (flag){
    	System.out.println(B*H);
    }
   
     
    
}}
