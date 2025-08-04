package module1;

/* Author: Samitha Sabu
* Date :4/08/2025
* Example of Array of Objects
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
System.out.println(empID+" "+empName+" "+salary);
}
}

public class ArrayOfObjects {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees");
int n=sc.nextInt();
Employee[] employees = new Employee[n];
for(int i=0;i<n;i++) {
System.out.println("Enter the Employee's ID");
long empID= sc.nextInt();
sc.nextLine();
System.out.println("Enter the Employee's name");
String empName=sc.nextLine();
System.out.println("Enter the Employee's salary");
int salary=sc.nextInt();
employees[i]= new Employee(empID,empName,salary);
}
System.out.println("empID empName salary");
for(int i=0;i<n;i++) {	
	employees[i].displayEmployee();
}

sc.close();
}
}





