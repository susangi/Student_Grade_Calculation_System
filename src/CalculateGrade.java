public class CalculateGrade {

    public static String calculateGrade(int mark) throws InvalidMarkException {
        String grade = "";

        if (100 >= mark && mark >= 90) {
            grade = "A";
        } else if (89 >= mark && mark >= 80) {
            grade = "B";
        } else if (79 >= mark && mark >= 70) {
            grade = "C";
        } else if (69 >= mark && mark >= 60) {
            grade = "D";
        } else if (0 <= mark && mark < 60) {
            grade = "F";
        } else {
            throw new InvalidMarkException("The mark is invalid!");
        }

        return grade;
    }
}
