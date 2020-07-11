package topic1;

import java.util.Scanner;

public class topic1_assi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double min = 0;
		double years = 0;
		double days = 0;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in minutes to convert: ");
		min = sc.nextDouble();
		sc.close();
		
		years = min/ (60*24*365);
		days = (int)(years*365) % 365;
		
		System.out.println((int)years + " years " + days + " days");
		
	}

}
