package topic2.assi1;

public class topic2_assi1 {

	public static void main(String[] args) {
		Book book = new Book("9780374528379", "The Brothers Karamazov", "Fyodor Dostoevsky", 20.00);
		book.displayDetails();
		book.discountedPrice(50);
	}
	
}
