package module1;
/** Author: SAMITHA SABU
 * Date: 29/07/2025
 */
import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int temp;
		System.out.println("Array after sorting");
		for(int i=0;i < n-1;i++) {
			for(int j=0;j < n-1;j++) {
				if(array[j] > array[j+1]) {
				temp=array[j];
				array[j]= array[j+1];
				array[j+1]= temp;
			}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"\t");
		}

		sc.close();
	}

}
