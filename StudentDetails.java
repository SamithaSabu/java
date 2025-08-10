package module1;
/** Author: SAMITHA SABU
 * Date: 04/08/2025
 */

import java.util.*;

class Student {
    String name;
    long registerNumber;
    String course;
    int[] mark;
    int total;
    int rank;

    Student(String name, long registerNumber, String course, int[] mark) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.course = course;
        this.mark = mark; 
        this.total = totalMarks();
    }

    int totalMarks() {
        int sum = 0;
        for (int i : mark) {
            sum += i;
        }
        return sum;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of student " + (i + 1));
            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            System.out.print("Enter the Register number: ");
            long registerNumber = sc.nextLong();
            sc.nextLine();

            System.out.print("Enter the course: ");
            String course = sc.nextLine();

            int[] mark = new int[6];
            System.out.println("Enter the marks of 6 subjects:");
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter the mark of subject "+(j+1)+": ");
                mark[j] = sc.nextInt();
            }
            sc.nextLine();

            students[i] = new Student(name, registerNumber, course, mark);
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].total < students[j + 1].total) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

       
        students[0].rank = 1;
        for (int i = 1; i < n; i++) {
            if (students[i].total == students[i - 1].total) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = i + 1;
            }
        }

        
        System.out.println("\nName\tRegNo\tCourse\tTotal\tRank");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + "\t" + students[i].registerNumber + "\t" +
                    students[i].course + "\t" + students[i].total + "\t" + students[i].rank);
        }      

        sc.close();
    }
}
