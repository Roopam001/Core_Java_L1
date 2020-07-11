package topic4.assi4;

import java.util.HashMap;

public class topic4_assi4 {
	
	public static void main(String[] args) {
		HashMap<String, String> telephoneBook = new HashMap<String, String>();
		
		telephoneBook.put("Riya", "9727354057");
		telephoneBook.put("Arjun", "9652319251");
		telephoneBook.put("Ruchi", "8243627395");
		telephoneBook.put("Aditya", "9342611432");
		
		System.out.println("Ruchi's Number: " + telephoneBook.get("Ruchi"));
	}


}
