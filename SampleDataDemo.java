package module1;
import java.util.Scanner;
class SampleData{
	int age;
	String name;
	void display() {
	System.out.println("\nStudent data");
	System.out.println("Name:"+name);
	System.out.println("Age: "+age);
}
}
	public class SampleDataDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        SampleData student = new SampleData();
        System.out.print("Enter name: ");
        student.name = sc.nextLine();
        System.out.print("Enter age: ");
        student.age = sc.nextInt();
        student.display();
        sc.close();
        
   	}
}

