package module1;
/** Author: SAMITHA SABU
 * Date: 29/07/2025
 */
import java.util.Scanner;
public class LargestSmallestInArray {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of elements: ");
		        int n = sc.nextInt();
		        int[] numbers = new int[n];
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = sc.nextInt();
		        }
		        int max = numbers[0];
		        int min = numbers[0];
		        for (int i = 1; i < n; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		        }
		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);

		        sc.close();
		    }

		}

