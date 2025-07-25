package module1;
/** Author: SAMITHA SABU
 * Date: 25/07/2025
 */
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator");
		operator=sc.next().charAt(0);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		switch(operator) {
		case '+':
		System.out.println("Sum is "+(num1+num2));
		break;
		case '-':
		System.out.println("Difference is "+(num1-num2));
		break;
		case '*':
		System.out.println("Product is "+(num1*num2));
		break;
		case '/':
		if(num2!=0) {
		System.out.println("Quiotient is "+(num1/num2));
		break;
		}
		else {
			System.out.println("Not defined");	
		}
		}
		sc.close();
	}

}
