package module1;
/** Author: SAMITHA SABU
 * Date: 29/07/2025
 */
import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		int found=0;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []Array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			Array[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched: ");
		int num=sc.nextInt();
		for(int i=0;i<n;i++) {
		if(Array[i]==num) {
			found=1;
			System.out.println(num+" is found at the position "+i);
			break;
		}
		}
		if(found==0) {
			
			System.out.println(num+" is not found");
		}
		sc.close();
		}
	}


