package module1;
/* Author: Samitha Sabu
 * Date :2/08/2025
 */
import java.util.*;
class Marks{
	int mark1;
	int mark2;
	int mark3;
	Marks(int m1,int m2,int m3) {
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void totalMarks() {
		int total= mark1+mark2+mark3;
		System.out.println("Total mark of the student is : "+total);
	}
	void averageMarks() {
		int avg= (mark1+mark2+mark3)/3;
		System.out.println("Average mark of the student is : "+avg);
	}
}
public class MarkAverageTotal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark of subject 1:");
		int m1=sc.nextInt();
		System.out.println("Enter the mark of subject 2:");
		int m2=sc.nextInt();
		System.out.println("Enter the mark of subject 3:");
		int m3=sc.nextInt();
		Marks student =new Marks(m1,m2,m3);
		student.totalMarks();
		student.averageMarks();
		sc.close();

	}

}
