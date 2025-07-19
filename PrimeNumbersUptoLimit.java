package module1;
/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
public class PrimeNumbersUptoLimit {

	public static void main(String[] args) {
		int prime;
		System.out.println("Prime numbers from 1 to 100 are");
		for(int i=2; i<=100; i++) {
			prime=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=0;
					break;
				}
			}
		if(prime==1) {
			System.out.println(i);
			}
		}
	}

}
