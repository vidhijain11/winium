package practiceSet2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collection {

	public static void main(String[] args) {
	
    Collection<Integer> value = new ArrayList<>();
    value.add(5);
    
    List<Integer> value1 = new ArrayList<>();
	}

}

interface mybook{
	void nameBook();
}
interface myLib extends mybook{
	void nameStudent();
}

class array implements myLib{

	@Override
	public void nameBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nameStudent() {
		// TODO Auto-generated method stub
		
	}
	
}