package module1;
/* Author: Samitha Sabu
 * Date :31/07/2025
 */
import java.util.Vector;

public class LargestInVector {

	public static void main(String[] args) {
		Vector<Integer> largest=new Vector<>();
		largest.add(25);
		largest.add(60);
		largest.add(15);
		largest.add(80);
		largest.add(45);
		int maximum=largest.get(0);
		System.out.println("Elements present in the Vector :"+largest);
		for(int i:largest) {
			if(maximum<i) {
				maximum=i;
			}
		}
		System.out.println("The largest element is "+maximum);
	}

}
