import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects = 5;
        int totalMarks = 0;
        int[] marks = new int[numberOfSubjects];

        System.out.println("🎓 Student Grade Calculator");
        System.out.println("---------------------------");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
            marks[i] = scanner.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("❌ Invalid input! Please enter marks between 0 and 100.");
                i--;
                continue;
            }

            totalMarks += marks[i];
        }

        double average = totalMarks / (double) numberOfSubjects;
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("\n📋 Result:");
        System.out.println("Total Marks = " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average = " + average + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}
