package module2;
/** Author: SAMITHA SABU
 * Date: 19/07/2025
 */
class AA{

	protected int i,j;
	void show() {// OVERRIDEN METHOD
		System.out.println("i and j in AA \ni "+i+" \nj= "+j);
	}
}
	class BB extends AA{
		int k;
		void show() { // OVERRIDIN METHOD
			System.out.println("i,j,k in BB ,\ni= "+i+"\nj= "+j+"\nk= "+k);	
		}
	}

	class BBB extends BB{
		void showijk() {
			System.out.println("i,j,k in BBB ,\ni= "+i+"\nj= "+j+"\nk= "+k);	
		}
	}

	public class MethodOverridingDemo {
	public static void main(String[] args) {
		BBB ob=new BBB();
		ob.i=1;
		ob.j=2;
		ob.k=3;
		ob.show();
		ob.show();
		ob.showijk();
	}
}




	

	
