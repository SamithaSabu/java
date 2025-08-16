package module2;
/** Author: SAMITHA SABU
 * Date: 16/08/2025
 */
import java.util.*;

class Students{
	String name;
	int rollNo;
	String course;
	
	void displayDetails() {
		System.out.println("Name    : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Course  : "+course);
		
	}
}
class StudentAccount extends Students{
	int collegeFee;
	void displayFee() {
		System.out.println("College Fee : "+collegeFee);
		
	}
}
class Hosteller extends StudentAccount{
	int hostelFee;
	int messFee;
	void totalFeeHosteller() {
		super.displayFee();
		System.out.println("Hostel Fee : "+hostelFee);
		System.out.println("Mess Fee   : "+messFee);
		int total=collegeFee + hostelFee + messFee;
		System.out.println("Total fees : "+total);
	}
}
class DayScholar extends StudentAccount{
	int busFee;
	void totalFee() {
		super.displayFee();
		System.out.println("Bus Fee : "+busFee);
		int total=collegeFee + busFee;
		System.out.println("Total fees : "+total);
	}
}
public class StudentInher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hosteller h =new Hosteller();
		System.out.println("Enter Hosteller's name : ");
		h.name=sc.nextLine();
		System.out.println("Enter the Roll Number: ");
		h.rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the course name: ");
		h.course=sc.nextLine();
		System.out.println("Enter College Fee : ");
		h.collegeFee=sc.nextInt();
		System.out.println("Enter Hostel Fee : ");
		h.hostelFee=sc.nextInt();
		System.out.println("Enter Mess Fee : ");
		h.messFee=sc.nextInt();	
		
		DayScholar ds=new DayScholar();
		System.out.println("Enter Day Scholar's name : ");
		sc.nextLine();
		ds.name=sc.nextLine();
		System.out.println("Enter the Roll Number: ");
		ds.rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the course name: ");
		ds.course=sc.nextLine();
		System.out.println("Enter College Fee : ");
		ds.collegeFee=sc.nextInt();
		System.out.println("Enter Bus Fee : ");
		ds.busFee=sc.nextInt();
		
		System.out.println("---Hosteller's Details--- ");
		h.displayDetails();
		h.totalFeeHosteller();
		
		System.out.println("---Day Scholar's Details--- ");
		ds.displayDetails();
		ds.totalFee();
       sc.close();
	}

}
