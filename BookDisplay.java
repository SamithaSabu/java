package module1;
/* Author: Samitha Sabu
 * Date :2/08/2025
 */
import java.util.*;
class Book{
	String title;
	String author;
	double price;

Book(String title,String author,double price){
	this.title=title;
	this.author=author;
	this.price=price;
}

void displayDetails() {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("Price :"+price);
	System.out.println("\n");
}
}

public class BookDisplay {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=2;i++) {
		System.out.println("Enter the Book's title");
		String title=sc.nextLine();
		System.out.println("Enter the Author's name");
		String author=sc.nextLine();
		System.out.println("Enter the Book's price");
		double price=sc.nextDouble();
		sc.nextLine();
		Book b1= new Book(title,author,price);
		b1.displayDetails();
		}
		sc.close();
	}

}





