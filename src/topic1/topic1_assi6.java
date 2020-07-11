package topic1;

public class topic1_assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{243,52,433,76,109,5};
		int largeNum = 0;
		
		for(int i =0; i< arr.length; i++){
			if (arr[i]>largeNum){
				largeNum = arr[i];
			}
		}
		
		System.out.println("Largest Number in array: " + largeNum);
		
	}

}
