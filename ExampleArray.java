package module1;
import java.util.*;
public class ExampleArray {

	public static void main(String[] args) {
		int[] numbers= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("array length"+numbers.length);
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Number "+(i+1)+":");
			numbers[i]=sc.nextInt();
		}
		System.out.println("\nNumbers you entered are:");
		for(int num :numbers) {
			System.out.println(num+"\t");
		
		}

	}

}
