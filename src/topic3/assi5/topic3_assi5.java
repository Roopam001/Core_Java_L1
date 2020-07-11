package topic3.assi5;

public class topic3_assi5 {
	
public static void main(String[] args) {
		
		String str = "How was your day today";
		char c ='a';
				
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		
		System.out.println("no.of occurrences of " + Character.toString(c) + " is = " + count);
	}
	

}
