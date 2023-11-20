import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i<numberOfStudents; i++) {
            System.out.println("Enter the grade for student " + (i+1));
            System.out.println("You can put in -3, 00, 02, 4, 7, 10 and 12 only");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // calculate average grade
        int sum = 0;
        for (int grade: grades) {
            sum+=grade;
        }
        double average = (double)sum/numberOfStudents; // hvorfor (double) her?

        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int i = 1; i<numberOfStudents; i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }
        System.out.println("The total average grade is: " + average);
        System.out.println("The highest grade is: " + highest);
        System.out.println("The lowest grade is: " + lowest);
    } // main
} // class