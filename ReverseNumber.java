package module1;
import java.util.*;
/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int number,reverse=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		int n=number;
		for(int i=1;number!=0;i++) {
			reverse*=10;
			reverse= reverse + number %10;
			number=number/10;
		}
		System.out.println("Reverse of "+n+" is "+reverse);
	}
}
