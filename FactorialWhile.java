package module1;
import java.util.*;
public class FactorialWhile {

	public static void main(String[] args) {
		int fac=1;
		int number;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		int i=1;
		while(i<=number) {
			fac*=i;
			i++;
		}
		System.out.println("Factorial of "+number+" is "+fac);
		
	}

}
