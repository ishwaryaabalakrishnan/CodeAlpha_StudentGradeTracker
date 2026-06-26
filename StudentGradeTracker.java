import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double mark;

    Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        String topper = "";
        String lowScorer = "";

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark: ");
            double mark = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, mark));

            total += mark;

            if (mark > highest) {
                highest = mark;
                topper = name;
            }

            if (mark < lowest) {
                lowest = mark;
                lowScorer = name;3
            }
        }

        double average = total / n;

        System.out.println("\n===== STUDENT REPORT =====");

        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Mark: " + s.mark);
        }

        System.out.println("\nAverage Mark: " + average);
        System.out.println("Highest Mark: " + highest + " (" + topper + ")");
        System.out.println("Lowest Mark: " + lowest + " (" + lowScorer + ")");

        sc.close();
    }
}
