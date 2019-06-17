package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("This book contains the word \"" + wordChoice + "\"");
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("This word is " + browser);
		}
		
		

	}

}
