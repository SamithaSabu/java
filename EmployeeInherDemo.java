package module2;
/** Author: SAMITHA SABU
 * Date: 16/08/2025
 */
import java.util.*;

class Employee {
    String name;
    String address;
    int age;
    int mobNo;
    float salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mobNo);
    }
}

class Officer extends Employee {
    String specialization;

    void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    void printDepartment() {
        System.out.println("Department: " + department);
    }
}

public class EmployeeInherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer ob = new Officer();
        System.out.println("Enter Officer's Name:");
        ob.name = sc.nextLine();
        System.out.println("Enter Address:");
        ob.address = sc.nextLine();
        System.out.println("Enter Age:");
        ob.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        ob.mobNo = sc.nextInt();
        System.out.println("Enter Salary:");
        ob.salary = sc.nextFloat();
        sc.nextLine(); 
        System.out.println("Enter Specialization:");
        ob.specialization = sc.nextLine();

        Manager m = new Manager();
        System.out.println("Enter Manager's Name:");
        m.name = sc.nextLine();
        System.out.println("Enter Address:");
        m.address = sc.nextLine();
        System.out.println("Enter Age:");
        m.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        m.mobNo = sc.nextInt();
        System.out.println("Enter Salary:");
        m.salary = sc.nextFloat();
        sc.nextLine(); 
        System.out.println("Enter Department:");
        m.department = sc.nextLine();
        System.out.println("--- Officer Details ---");
        ob.printDetails();
        ob.printSalary();
        ob.printSpecialization();    
        System.out.println("--- Manager Details ---");
        m.printDetails();
        m.printSalary();
        m.printDepartment();

        sc.close();
    }
}
