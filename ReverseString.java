package module2;

/** Author : Samitha Sabu
 * Date : 01/09/2025
 */
import java.util.*;

class Rev{
void Reverse(String s) {
	String r="";
	String str=s;
	for(int i = s.length()-1; i >= 0 ;i--) {
		r = r + s.charAt(i);
	}
	System.out.println("Reverse of "+str+" is "+r);
  }	
}
public class ReverseString {

	public static void main(String[] args) {
		
		String word;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		word = sc.nextLine();
		Rev ob =new Rev();
		ob.Reverse(word);
		sc.close();

	}

}
