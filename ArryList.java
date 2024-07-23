package demo.rk;

import java.util.ArrayList;
import java.util.List;

public class ArryList {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<>();;
		number.add(5);
		number.add(12);
		number.add(10);
		number.add(58);
		number.add(590);
		List<String> s=new ArrayList<>();;
		s.add("Black");
		s.add("White");
		s.add("Blue");
		s.add("Red");
		s.add("Green");
		for(String a:s)
		{
			System.out.println(a);
		}
		
       number.forEach(
    		   (n)->
    		   {
    			 if (n%2==0) {
    				 System.out.println(n);
    			 } 
    		   }
    		   
    		   );
	}

}
