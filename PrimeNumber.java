package module1;
/** Author: SAMITHA SABU
 * Date: 18/07/2025
 */	
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		int number,prime=1;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		if(number<=1) {
			prime=0;
		}
		else {
		for(int i=2; i<number/2 ;i++) {
	     if (number% i == 0) {
				prime=0;
				break;
			}
		}
		}
		if(prime==1) {
		System.out.println(number+" is a prime number");
		}
		else {
		System.out.println(number+" is not a prime number");
		}
	}

}
