// StudentGradeCalculator.java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input marks
        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();

        // Calculate total and average
        int total = math + science + english;
        double average = total / 3.0;

        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Output result
        System.out.println("\n--- Result ---");
        System.out.println("Student: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
