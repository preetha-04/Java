//practice
package Collection;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) {
		
		HashSet<String> setList1  = new HashSet<>();
		
		setList1.add("Red");
		setList1.add("Green");
		setList1.add("Yellow");
		setList1.add("Black");
		
		System.out.println("List 1:"+setList1);
		
		HashSet<String> setList2  = new HashSet<>();
		
		setList2.add("Green");	
		setList2.add("Magenta");
		setList2.add("Purple");
	    setList2.add("Orange");
		
		System.out.println("List 2:"+setList2);
		setList1.addAll(setList2);
		
		System.out.println("After mergin two arrays :"+setList1);
		
			
		


	}

}
