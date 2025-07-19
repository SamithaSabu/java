package module1;
/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if((year%4 ==0 && year % 100!=0)||(year% 400==0)) {
			System.out.println(year+" is a LEAP year");
		}
		else {
			System.out.println(year+" is not a LEAP year");	
		}

	}

}
