package module1;
/* Author: Samitha Sabu
 * Date :2/08/2025
 */
import java.util.*;
class Employee {
	long empID;
	String empName;
	int salary;
	Employee(long empID,String empName,int salary){
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;
		
	}
	void displayEmployee() {
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee's salary : "+salary);
		System.out.println("\n");
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++) {
		System.out.println("Enter the Employee's ID");
		long empID= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee's name");
		String empName=sc.nextLine();
		System.out.println("Enter the Employee's salary");
		int salary=sc.nextInt();
		Employee e1= new Employee(empID,empName,salary);
		e1.displayEmployee();
		}
		sc.close();
		
	}

}
