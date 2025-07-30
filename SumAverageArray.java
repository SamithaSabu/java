package module1;
/** Author: SAMITHA SABU
 * Date: 29/07/2025
 */
import java.util.*;
public class SumAverageArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements ");
	        int n = sc.nextInt();
	        int[] numbers = new int[n];
	        int sum = 0;
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	            sum += numbers[i];
	        }
	        double average = (double) sum / n;
	        System.out.println("Sum of elements: " + sum);
	        System.out.println("Average of elements: " + average);

	        sc.close();
	    }
	}
