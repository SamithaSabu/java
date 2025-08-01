package module1;
/* Author: Samitha Sabu
 * Date :31/07/2025
 */
import java.util.Vector;
public class VectorString {

	public static void main(String[] args) {
		Vector<String> fruits=new Vector<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Avacado");
		for(String i:fruits) {
			System.out.println(i);

		}
	}
}
