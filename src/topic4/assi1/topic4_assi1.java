package topic4.assi1;

import java.util.Random;

public class topic4_assi1 {
	
public static void main(String[] args) {
		
		
		for(int i=0; i<5; i++){
			
			RandomNum rt= new RandomNum();
			rt.start();	
		}
	}
}

class RandomNum extends Thread{
	Random r = new Random();
	int num;
	
	public RandomNum() {
		num = (r.nextInt(101));
		
	}
	
	public void run() {
		try{
			
			System.out.println("Number: " + num);
			Factorial ft = new Factorial(num);
			ft.start();
		}catch(Exception e){
			
		}
		
	}
}

class Factorial extends Thread{
	int num;
	
	public Factorial(int num) {
		this.num = num;
	}
	
	public int produceFac(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num * produceFac(num-1);
		}
	}
	
	public void run(){
		try{
			System.out.println("Factorial: " + produceFac(num));
		}catch(Exception e){
			
		}
	}

}
