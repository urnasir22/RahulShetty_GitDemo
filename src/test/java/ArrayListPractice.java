import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Md");
		a.add("Nasir");
		a.add("Selenium");
		a.add("remove");
		a.remove(3);
		System.out.print(a+" ");
		System.out.println("");
		
		//Print all items in arraylist (iterate over arraylist)
		
		//Using for loop
		System.out.println("Using for loop");
		for(int i =0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		//using for each loop or advanced for loop
		System.out.println("Using for each loop");
		for(String str : a) {
			System.out.println(str);
		}
		
		//Check Selenium String is present in array list or not
		System.out.println(a.contains("selenium")); //case sensitive
		System.out.println(a.contains("Selenium")); //case sensitive

	}

}































