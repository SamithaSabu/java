package module1;

/* Author: SAMITHA SABU
 * 
 */
class Book{
	String title;
	String author;
	double price;

Book(){
	title="Unknown";
	author="Not Assigned";
	price=0.0;
}
Book(String title,String author,double price){
	this.title=title;
	this.author=author;
	this.price=price;
}
void displayDetails() {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("Price :"+price);
}
}
public class BookDetails {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.displayDetails();
		Book b2= new Book("House of Cards","SUDHA MURTHY",500.00);
		b2.displayDetails();
	}
}




