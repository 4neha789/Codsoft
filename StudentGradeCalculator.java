/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stugradecalculator;

/**
 *
 * @author User
 */


  import java.util.Scanner;

public class StuGradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalSubjects;
            System.out.print("Enter the total number of subjects: ");
            totalSubjects = scanner.nextInt();
            
            int totalMarks = 0;
            for (int i = 1; i <= totalSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }
            
            double averagePercentage = (double) totalMarks / totalSubjects;
            
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            
            String grade;
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B";
            } else if (averagePercentage >= 60) {
                grade = "C";
            } else if (averagePercentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            System.out.println("Grade: " + grade);
        }
    }
}





