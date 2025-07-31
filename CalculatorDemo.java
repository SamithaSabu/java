package module1;
/** Author: SAMITHA SABU
 * Date: 31/07/2025
 */
import java.util.*;

class MyCalculator{
	double number1;
	double number2;
	MyCalculator(double n1,double n2){
		number1=n1;
		number2=n2;
	}

	double add() {
	    return number1 + number2;

	}

	double subtract() {
		return number1 - number2;

	}

	double multiply() {
		return number1 * number2;

	}

	double divide() {
			return number1 / number2;
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("---Calculator Menu---");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		System.out.println("Enter your choice (1-4) :");
		int choice=sc.nextInt();
		System.out.println("Enter two numbers: ");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		MyCalculator mc=new MyCalculator(number1,number2);

		switch(choice) {

		case 1:

			double sum=mc.add();
			System.out.println("Sum of "+number1+ " and "+number2+" is "+sum);
			break;

		case 2:

			double diff=mc.subtract();
			System.out.println("Difference of "+number1+ " and "+number2+" is "+diff);
			break;
			
		case 3:

			double product=mc.multiply();
			System.out.println("Product of "+number1+ " and "+number2+" is "+product);
			break;
			
		case 4:
			if(number2==0) {
				System.out.println("Undefined");
			}
			else {

			double quotient=mc.divide();
			System.out.println("Quotient of "+number1+ " and "+number2+" is "+quotient);
			}
			break;

			default:
				System.out.println("Invalid entry:");
								
		}
		
		System.out.println("Do you want to continue calculating (Y/N) :");
		ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		
		System.out.println("Thank you");
		sc.close();
	}
}
