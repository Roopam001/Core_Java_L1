package topic4.assi5;

import java.util.HashSet;
import java.util.Iterator;

public class topic4_assi5 {
	
	public static void main(String[] args) {
		HashSet<String> employees = new HashSet<String>();
		employees.add("Richa");
		employees.add("Mayuri");
		employees.add("Dev");
		employees.add("Khushi");
		employees.add("Manav");
		
        Iterator<String> i=employees.iterator();  
        while(i.hasNext())  
        {  
        	System.out.println(i.next());  
        }  

	}


}
