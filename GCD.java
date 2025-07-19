package module1;
/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int number1,number2,temp;
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		number1=sc.nextInt();
		number2=sc.nextInt();
		int num1=number1;
		int num2=number2;
		while(num2 !=0) {
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		System.out.println("Greatest common divisor of "+number1+" and "+number2+" is "+num1);
	}

}
