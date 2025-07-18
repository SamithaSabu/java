package module1;

import java.util.*;
public class ScoreCard {
    public static void main(String[] args) {
        int score=0;
        String grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score:");
        score=sc.nextInt();
        if(score>=90) {
            grade="S";
        }
        else if(score<90 && score>=85) {
            grade="A+";
        }
       else if(score<85 && score>=80) {
            grade="A"; 
        }
        else if(score<80 && score>=75) {
            grade="B+";
        }
        else if(score<75 && score>=70) {
            grade="B";
        }
        else if(score<70 && score>=65) {
            grade="C+";
        }
        else if(score<65 && score>=60) {
            grade="C";
        }
        else if(score<60 && score>=55) {
            grade="D";
        }
        else if(score<55 && score>=50) {
            grade="P";
        }
        else{
            grade="F";
        }
        System.out.println("Grade of the student with score "+score+"  is "+grade);
    }
    }