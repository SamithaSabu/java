package module2;

/** Author : Samitha Sabu
 * Date : 02/09/2025
 */
import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the String: ");
		        String str = sc.nextLine();
		        char result = NonRepeatingChar(str);
		        if (result == '\0') {
		            System.out.println("No character is repeated");
		        } else {
		            System.out.println("First non-repeating character is : " + result);
		        }

		        sc.close();
		    }

		    static char NonRepeatingChar(String s) {
		    	 int count;
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		           count =0;

		            for (int j = 0; j < s.length(); j++) {
		                if (s.charAt(j) == ch) {
		                    count = count + 1;
		                }
		            }

		            if (count == 1) {
		                return ch;
		            }
		        }
		        return '\0';
		    }

	}


