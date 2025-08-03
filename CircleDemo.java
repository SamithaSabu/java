package module1;
/* Author: Samitha Sabu
 * Date :2/08/2025
 */

import java.util.Scanner;
class Circle{
	int radius;
	Circle(int radius) {
		this.radius=radius;
	}
	void Area() {
		double area=3.14*radius*radius;
		System.out.println("Area of circle with radius "+radius+ " is "+area);
	}
	void Circumference() {
		double circum= 2* 3.14*radius;
		System.out.println("Circumference of circle with radius "+radius+ " is "+circum);
	}
}
public class CircleDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=sc.nextInt();
		Circle c1= new Circle(r);
		c1.Area();
		c1.Circumference();
		sc.close();
		

	}

}
