import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a new student
        System.out.print("Enter a student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Create a list to store students
        List<Student> students = new ArrayList<>();

        // Add pre-defined students
        students.add(new Student("Nadya", 29));
        students.add(new Student("Weli", 90));
        students.add(new Student("Weli Nadya", 100));

        // Add user-defined student to the list
        students.add(new Student(name, grade));

        // Filter and display students with grade > 80
        System.out.println("Students with grade above 80:");
        students.stream()
                .filter(student -> student.getGrade() > 80)
                .forEach(System.out::println);

        // Calculate and display the average grade
        double averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);

        System.out.println("Average grade: " + averageGrade);

        // Display the user-entered student information
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
