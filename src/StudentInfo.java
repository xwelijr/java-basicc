import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner studentInfo = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String yourName = studentInfo.nextLine();

        System.out.println("Enter your age : ");
        int age = studentInfo.nextInt();

        studentInfo.nextLine();

        System.out.println("Enter Your Major : ");
        String major = studentInfo.nextLine();

        System.out.println("Enter your GPA : ");
        float gpa = studentInfo.nextFloat();

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattenDate = currentDate.format(formatDate);

        System.out.println("Student Information");
        System.out.println("Name : " +yourName);
        System.out.println("Age :  "  + age);
        System.out.println("Major :  " +major);
        System.out.println("GPA : " +gpa);
        System.out.println("Date : "  + formattenDate);
    }
}