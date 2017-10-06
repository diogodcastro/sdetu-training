package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word Ring");
		}

		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome.");
		}
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "023452542";
		nameStrings(firstName, lastName, SSN);
		
	}
	
	
	static void nameStrings(String fstName, String lstName, String sSN){
		
		System.out.println("There are " + sSN.length() + " digitis in your SSN.");

		System.out.print(fstName.substring(0,1));
		System.out.print(lstName.substring(0,1));
		System.out.println(sSN.substring(4,8));
	}
}
