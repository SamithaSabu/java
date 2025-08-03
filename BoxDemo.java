package module1;
import java.util.*;
/*Samitha Sabu
*/
class Box1{
	double width;
	double height;
	double depth;
	Box1(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume() {
		return width*height*depth;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width");
		double width=sc.nextDouble();
		System.out.println("Enter the height");
		double height=sc.nextDouble();
		System.out.println("Enter the depth");
		double depth=sc.nextDouble();
		Box1 b1=new Box1(width,height,depth);
		double V=b1.volume();
		System.out.println("Volume of the box is : "+V);
		sc.close();
	}
}

