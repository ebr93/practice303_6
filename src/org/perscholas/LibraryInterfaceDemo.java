package org.perscholas;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		// Case 1
		System.out.println("Case 1");
		KidUser kidOne = new KidUser(10, "Kids");
		KidUser kidTwo = new KidUser(18, "Fiction");
		
		kidOne.registerAccount();
		kidOne.requestBook();
		
		kidTwo.registerAccount();
		kidTwo.requestBook();
		System.out.println("____________________");
		
		// Case 2
		System.out.println("Case 2");
		AdultUser adultOne = new AdultUser(5, "Kids");
		AdultUser adultTwo = new AdultUser(23, "Fiction");
		
		adultOne.registerAccount();
		adultOne.requestBook();
		
		adultTwo.registerAccount();
		adultTwo.requestBook();
		System.out.println("____________________");
	}
}

interface LibraryUser {
	void registerAccount();
	void requestBook();
}

class KidUser implements LibraryUser {
	int age;
	String bookType;
	
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		if (this.age <= 11) System.out.println("“You have successfully registered under a Kids Account");
		else System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
	
	@Override
	public void requestBook() {
		if (bookType.equals("Kids")) System.out.println("Book Issued successfully, please return the book within 10 days");
		else System.out.println("Oops, you are allowed to take only kids books");
	}
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;
	
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		if (age >= 12) System.out.println("You have successfully registered under an Adult Account");
		else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	
	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) System.out.println("Book Issued successfully, please return the book within 7 days");
		else System.out.println("Oops, you are allowed to take only adult Fiction books");
	}
}