package module2;

import java.util.Scanner;

/** Author : Samitha Sabu
 * Date : 03/09/2025
 */
public class ReplaceOccurence {

	public static void main(String[] args) {
		
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = sc.nextLine();
		System.out.println("Enter a character to replace ");
		char x= sc.next().charAt(0);
		String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            if (count > 1) {
                result += x;
            } else {
                result += ch;
            }
        }

        System.out.println("New string: " + result);
        sc.close();
    }
}
