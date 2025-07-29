package module1;
import java.util.*;
public class InputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []Array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			Array[i]=sc.nextInt();
		}
		System.out.println("Elements of array in the same order:");
		for(int i=0;i<n;i++) {
			System.out.print(Array[i]+"\t");
		}
		System.out.println();
		System.out.println("Elements of array in reverse order:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(Array[i]+"\t");	
		}
		
		sc.close();
	}

}
