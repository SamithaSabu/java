package module2;

/** Author: SAMITHA SABU
 * Date: 17/08/2025
 */
class Book {
	String title;
	String author;
	
	void display() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
}

class Technical extends Book{
	String subject;
	void display() {
		super.display();
		System.out.println("Subject : "+subject);
	}
}

class Story extends Technical{
	String genre;
	void display() {
		super.display();
		System.out.println("Genre : "+genre);
	}
}
public class BookMethOverriding {

	public static void main(String[] args) {
		
		Book b= new Book();
		Technical t=new Technical();
		Story s= new Story();
		b.title="Wings of Fire";
		b.author="Abdul Kalam";
		b.display();
		
		b=t;
		System.out.println("\n--Technical Book--\n");
		t.title="Java";
		t.author="Herbert Schildt";
		t.subject="Programming";
		b.display();
		
		b=s;
		System.out.println("\n--Story Book--\n");
		s.title="Harry Potter";
		s.author="J.K. Rowling";
		s.genre="Fantasy";
		s.subject="Magic and Wizardry";
		b.display();

	}

}
