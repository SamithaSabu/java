package module1;
/** Author: SAMITHA SABU
 * Date: 24/07/2025
 */
import java.util.Scanner;

public class FibonacciFor {
	public static void main(String args[]) {
		int n,temp=0,i;
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println("First "+n+" fibonacci numbers are:");
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<n-2;i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}
		
	}
}
