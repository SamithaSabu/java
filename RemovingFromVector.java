package module1;
/* Author: Samitha Sabu
 * Date :31/07/2025
 */
import java.util.Vector;
public class RemovingFromVector {

	public static void main(String[] args) {
		Vector<String> colours=new Vector<>();
		colours.add("Red");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Yellow");
		System.out.println("Elements initially present in the Vector :"+colours);
		String removed=colours.remove(1);
		System.out.println("Removed element is :"+removed);
		System.out.println("Elements present in the Vector after removing :"+colours);
	
		
	}

}
