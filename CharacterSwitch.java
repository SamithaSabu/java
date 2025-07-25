package module1;
/** Author: SAMITHA SABU
 * Date: 25/07/2025
 */
import java.util.*;
public class CharacterSwitch {
	public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a character: ");
		        char ch = sc.next().toLowerCase().charAt(0);
		            switch (ch) {
		                case 'a':
		                case 'e':
		                case 'i':
		                case 'o':
		                case 'u':
		                    System.out.println(ch + " is a vowel.");
		                    break;
		                default:
		                    System.out.println(ch + " is a consonant.");
		            }
		       		        sc.close();
		    }
		}

