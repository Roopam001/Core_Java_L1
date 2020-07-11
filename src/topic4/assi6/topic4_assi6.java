package topic4.assi6;

public class topic4_assi6 {
	
	public topic4_assi6() {
		new A1();
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A1 a = new A1();
		a = new A1();
		a = new A1();
		Runtime.getRuntime().gc();
	}


}
