package module1;
/** Author: SAMITHA SABU
 * Date: 25/07/2025
 */
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,temp,rev=0,number;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt(); 
		num=number;
		while(number!=0) {
			temp=number%10;
			rev=rev*10+temp;
			number=number/10;
		}
		if(rev==num) {
			System.out.println(num+" is a Palindrome number");
		}
		else {
			System.out.println(num+" is not a Palindrome number");	
		}
		sc.close();
	}

}
