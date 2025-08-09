package module2;
/** Author: SAMITHA SABU
 * Date: 08/08/2025
 */
class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
	public void eat () {
		super.eat();
		System.out.println("Boy is eating");	
	}
}
public class MethodOverRidingDemo1 {

	public static void main(String[] args) {
		Boy obj=new Boy();
		obj.eat();
	}
}
