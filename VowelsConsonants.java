package module2;

import java.util.Scanner;

/** Author : Samitha Sabu
 * Date : 02/09/2025
 */
public class VowelsConsonants {

	public static void main(String[] args) {
		
		String word;
		int vowelCount= 0;
		int consonantCount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		word = sc.nextLine();
		word=word.toLowerCase();
		for(int i=0; i< word.length() ;i++) {
		/*	if(word.charAt(i)==' ') {
				continue;
			}*/
			if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
			if(word.charAt(i)=='a'|| word.charAt(i)=='e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
				vowelCount++;
			}
			else {
				consonantCount++;
		     	}
			}
		}
		System.out.println("Count of vowels : "+vowelCount);
		System.out.println("Count of Consonants : "+consonantCount);
		
		sc.close();

	}

}
