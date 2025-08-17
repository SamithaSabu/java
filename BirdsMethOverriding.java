package module2;
/** Author: SAMITHA SABU
 * Date: 17/08/2025
 */
class Bird{
	 void fly() {
		 System.out.println("Birds learn to fly not by staying in the nest, but by daring to fall.\n");
	 }
}

class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow flies short distances.\n");
	}
}

class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle soars high in the sky.");
	}
}

public class BirdsMethOverriding {

	public static void main(String[] args) {
		
		Bird []birds=new Bird[3];
		birds[0]=new Bird();
		birds[1]=new Sparrow();
		birds[2]=new Eagle();
		for(int i=0;i<3;i++) {
			birds[i].fly();
		}
		
		
	}

}
 
