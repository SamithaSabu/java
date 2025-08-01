package module1;
/* Author: Samitha Sabu
 * Date :31/07/2025
 */
import java.util.Vector;
import java.util.Scanner;
public class SearchingInVector {

	public static void main(String[] args) {
		String item;
		int f=0;
		Vector<String> things=new Vector<>();
		things.add("Pen");
		things.add("Notebook");
		things.add("Eraser");
		things.add("Marker");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an item name");
		item=sc.nextLine();
		for(String i:things) {
			if(item.equalsIgnoreCase(i)) {
			f=1;
			break;
		}
	}
		if(f==1) {
			System.out.println(item+" Item found");	
		}
		else {
			System.out.println(item+" Item not found");	

		}
		sc.close();
		
	}

}
