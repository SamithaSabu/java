import java.util.*;
public class fullDetails
{
    public static void main(String[] args) {
        float mark=0;
        System.out.println("Enter the name of student");
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter the age of student");
        int age=sc.nextInt();
        System.out.println("Enter the mobile number of student");
        long moblieNumber=sc.nextLong();
        System.out.println("Enter the CGPA of student");
        double cgpa=sc.nextDouble();
        System.out.println("Enter the attendance percentage");
        float attendancePercentage=sc.nextFloat();
        if(attendancePercentage >=90) {
            mark=10;
        }
        else {
             mark= (attendancePercentage/10);
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+moblieNumber);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Attendance Mark: "+mark);
        }
}