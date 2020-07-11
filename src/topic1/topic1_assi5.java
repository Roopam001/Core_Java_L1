package topic1;

import java.util.Scanner;

public class topic1_assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in = 0;
		int num = 0;
		int p = 0;
		int sumNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in 4-digit number: ");
		in = sc.nextInt();
		sc.close();
		
		num = in;
		while(num != 0 ){
			
			p = num % 10;
			num = (int)num / 10;
									
			sumNum += p;
		}
		
		System.out.print("Sum of " + in + " is: " + sumNum);

	}

}
