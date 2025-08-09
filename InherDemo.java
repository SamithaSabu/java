package module2;
/*Author:Samitha  Sabu
*Date:  8-08-2025
*/
class A{
	protected int i,j;
	void showij() {
		System.out.println("i and j in A \ni "+i+" \nj= "+j);
	}
}

	class B extends A{
		int k;
		void showk() {
			System.out.println("i,j,k in B ,\ni= "+i+"\nj= "+j+"\nk= "+k);	
		}
	}

	class A1 extends B{
		void showijk() {
			System.out.println("i,j,k in A1 ,\ni= "+i+"\nj= "+j+"\nk= "+k);	
		}
	}

public class InherDemo {
	public static void main(String[] args) {
		A1 ob=new A1();
		ob.i=1;
		ob.j=2;
		ob.k=3;
		ob.showij();
		ob.showk();
		ob.showijk();
	}
}




