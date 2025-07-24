package module1;
/** Author: SAMITHA SABU
 * Date: 24/07/2025
 */
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		int num,temp=0,sum=0;
		System.out.println("Enter a four digit number ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int number=num;
		while(num!=0) {
			temp=num %10;
			sum=sum + temp;
			num=num/10;
		}
		System.out.println("The sum of each digits of "+number+" is "+sum);
	}

}
