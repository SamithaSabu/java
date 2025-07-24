package module1;
import java.util.*;
public class OddNumbers {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
