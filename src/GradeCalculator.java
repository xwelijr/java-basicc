public class GradeCalculator {
    public static void main(String [] args) {
        int studentScore = 85;
         String studentGrade;

        // calculations if else
        if (studentScore >= 90) {
            studentGrade = "A";
        } else if (studentScore >= 80 && studentScore <= 89) {
            studentGrade = "B";
        } else if (studentScore >= 70 && studentScore <= 79) {
            studentGrade = "C";
        } else if (studentScore >= 60 && studentScore <= 69) {
            studentGrade = "D";
        } else {
            studentGrade = "F";
        }
    // Output the result
        System.out.println("Student Score: " + studentScore);
        System.out.println("Student Grade: " + studentGrade);
}

}









