
public class StringPractice {

	public static void main(String[] str) {

		// String is an object that represent sequence of character

		// We can create String using 2 ways one is String literal second is using new keyword
		String s = "Nasir";
		String s1 = "Nasir"; // both reference variable will show to the same memory location because String
								// is same(only one String will be created)

		String s2 = new String("Nasir");// will create new object
		String s3 = new String("Nasir");// will create new object

		String s4 = "Nasir is learning Selenium";

		String[] splittedText = s4.split("learning");

		System.out.println(splittedText[0]);
		System.out.println(splittedText[1]); //without trim method
		System.out.println(splittedText[1].trim() +" : after trim"); //with trim method
		
		//print all character one by one from string s4
		System.out.println("print all character one by one from string s4");
		for(int i=0; i<s4.length(); i++) {
			System.out.println(s4.charAt(i));
		}
		
		//print all character in reverse order
		System.out.println("print all character in reverse order");
		for(int i = s4.length()-1; i>=0; i--) {
			System.out.print(s4.charAt(i));
		}
		
		

	}

}




























