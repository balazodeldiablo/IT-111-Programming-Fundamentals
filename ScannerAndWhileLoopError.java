import java.util.Scanner;

public class ScannerAndWhileLoopError {
    public static void main (String[]args) {
        int grade;
        int i = 0;
        double total = 0;
        double average;
        Scanner input = new Scanner (System.in);

        

        while (i < 5) {
            if (i == 0) {
                System.out.println("Please enter your first numerical grade:");
                grade = input.nextInt();
                total += grade;
            } else {
                System.out.println("Please enter your next numerical grade:");
                grade = input.nextInt();
                total += grade;
            }
            i++;
            // I used i++ at the end of this loop to avoid the "counter -= 1" syntax. 
        }

        String message;
        char letterGrade;

        average = total/i;

        if (average >= 90 && average <= 100) { 
            // The line above had an error. "<" was used instead of "<=" excluding the possible occurence of a 100% average.
            letterGrade = 'A';
            message = "Excellent!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "Study more!";
        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "You did not pass.";
        }

        System.out.println("Here's your letter grade: " +letterGrade+ ". Your average numerical grade is: " +average+ ". " +message);

    }
}
