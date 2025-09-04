package module2;

/** Author : Samitha Sabu
 * Date : 01/09/2025
 */
import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		
		String word,s,r="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		word = sc.nextLine();
		s=word;
		int l =word.length();
		for(int i = l-1; i >= 0 ;i--) {
			r = r + s.charAt(i);
		}
		if(word.equals(r)) {
			System.out.println("The String is Palindrome");
		}
		else {
			System.out.println("The String is not Palindrome");
		}

		sc.close();	
	}

}
