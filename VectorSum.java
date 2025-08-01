package module1;
/* Author: Samitha Sabu
 * Date :31/07/2025
 */
import java.util.Vector;
public class VectorSum {

	public static void main(String[] args) {
		int result=0;
		Vector<Integer> sum=new Vector<>();
		sum.add(10);
		sum.add(20);
		sum.add(30);
		sum.add(40);
		sum.add(50);
		System.out.println("Elements present in the Vector :"+sum);
		for(int i:sum) {
			result +=i;
		}
		System.out.println("Sum of elements are :"+result);

	}

}
