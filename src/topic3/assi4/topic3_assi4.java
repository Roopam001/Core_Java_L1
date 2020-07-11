package topic3.assi4;

public class topic3_assi4 {
	
	public static void main(String[] args) {
		int b=0;
		int e=args[0].length()-1;
		int flag=0;

		while(b<e && flag==0){
			
			if(Character.toLowerCase(args[0].charAt(b)) != Character.toLowerCase(args[0].charAt(e))){
				flag=1;
			}
			else{
				b++;
				e--;
			}
		}
		if(flag==0) {
			
			System.out.println(args[0] + " is a" + " palindrome. ");
			
		}
		else {
			
			System.out.println(args[0] + " is not a" + " palindrome. ");
			
		}
		
	}


}
