package module2;
/** Author: SAMITHA SABU
 * Date: 08/08/2025
 */
class AAA {
	AAA(){
		System.out.println("Base constructor");
	}
}

class BBBB extends AAA{
	BBBB(int x){
		System.out.println("Derived constructor");
	}
}

public class InherTest {
	public static void main(String[] args) {
	BBBB ob=new BBBB(1);
	}
}



