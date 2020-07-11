package topic3.assi1;

public class topic3_assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			if(Integer.parseInt(args[1])<18 || Integer.parseInt(args[1])>=60){
				throw new MyException("Number is out of range");
			}
			
			else{
				System.out.println("Number is within range.");
			}
		}
		// if number is out of range
		catch(MyException e){
			System.out.println(e.getMessage());
		
		}
		// if second argument is not a number
		catch(NumberFormatException e){
			System.out.println("Second argument is not a number.");
		}


	}

}
