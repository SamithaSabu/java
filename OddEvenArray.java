package module1;
/** Author: SAMITHA SABU
 * Date: 29/07/2025
 */
import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		int evenCount=0,oddCount=0;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(array[i] % 2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Count of even numbers are: "+evenCount);
		System.out.println("Count of odd numbers are: "+oddCount);
			sc.close();
	}

}
