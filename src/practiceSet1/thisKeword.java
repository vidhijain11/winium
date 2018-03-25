package practiceSet1;

public class thisKeword {

	public static void main(String[] args) {
		new menu(4,5).munui_tem();

	}}
	class menu{
		int a;
		int b;
		menu(){
			this(4,5,6);
		}
		menu(int a, int b, int c){
			
		}
		menu(int a,int b){
			this(4,5,6);
			this.a=a;
			this.b=b;
			this.munui_tem();}
		void munui_tem(){
			
		System.out.println(a+"  "+b);
		
		
		}
	}


