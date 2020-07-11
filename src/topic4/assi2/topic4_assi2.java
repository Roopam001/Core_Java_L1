package topic4.assi2;

public class topic4_assi2 {
	
	public static void main(String[] args) {
	    try {
	    	
	    	int numOfSec = 2;
	    	int duration = 20;
	    	int left = duration/numOfSec;
	        while (left != 0) {
	            System.out.println(java.time.LocalTime.now());
	            Thread.sleep(numOfSec * 1000);
	            left -= 1;
	        }
	        System.out.println("Program exiting...");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

}
