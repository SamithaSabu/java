package module1;

import java.util.Scanner;

/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
public class Fibanocci {
	public static void main(String args[]) {
		int limit,temp=0,i=1;
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		while(i<=limit) {
			temp=a+b;
			a=b;
			b=temp;
			i++;
			System.out.println(temp);
		}
		
	}
}
