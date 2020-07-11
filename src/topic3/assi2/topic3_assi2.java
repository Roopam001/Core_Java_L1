package topic3.assi2;

public class topic3_assi2 {

	public static void main(String[] args) {
		
		try{
			
			double avg1 = (Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]))/3;
			double avg2 = (Integer.parseInt(args[5]) + Integer.parseInt(args[6]) + Integer.parseInt(args[7]))/3;;
			System.out.println("Average of " + args[0] +": " + avg1 );
			System.out.println("Average of " + args[4] +": " + avg2 );
		}
		catch(NumberFormatException e){
			System.out.println("Not a number. ");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Not enough arguments.");
		}

	}

}
