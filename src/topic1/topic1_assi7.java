package topic1;

import java.util.Scanner;

public class topic1_assi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number: ");
		num = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(num));
		
	}
	
	public static int factorial(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num * factorial(num-1);
		}
		
	}

}
