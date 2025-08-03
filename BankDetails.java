package module1;
/* Author: Samitha Sabu
 * Date :2/08/2025
 */
import java.util.Scanner;

class BankAccount{
	long accountNumber;
	String accountHolder;
	double balance;
	BankAccount(long accNo,String accHolder,double bal){
		accountNumber=accNo;
		accountHolder=accHolder;
		balance=bal;
	}
	void deposit(double amount) {
			balance+=amount;
			 System.out.println("Updated balance : " + amount);
		}
		
	void displayDetails() {
		System.out.println("\nAccount Details:");
		System.out.println("Account number : "+accountNumber);
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Account Balance : "+balance);
	}
	
}
public class BankDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        System.out.print("Enter the Balance: ");
        double bal = sc.nextDouble();
        BankAccount ac=new BankAccount(accNo,accHolder,bal);
        System.out.print("Enter amount to deposit: ");
        double amount=sc.nextDouble();
        ac.deposit(amount);
        ac.displayDetails();
        sc.close();
	}

}
