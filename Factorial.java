import java.util.*;
public class Factorial {
    public static void main(String args[]){
        long fac=1;
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
         fac=fac*i;   
        }
        System.out.println("Factorial of "+number+" is "+fac);
    }

}
