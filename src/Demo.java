import java.lang.reflect.Array;

public class Demo {
    public static void main(String[] args) throws InvalidMarkException {

        try {
            // used parameterise contractor
            Student s1 = new Student("Susangi", "susangi@gmail.com", 28, "Gampaha", 74);
            s1.displayStudentDetails();
            System.out.println();

            // get 5 student data form user input
            int countOfStudents = 2;
            Student[] students = new Student[countOfStudents];
            for (int i = 0; i < countOfStudents; i++) {
                System.out.println("Student #" + (i + 1) + " details enter -");
                students[i] = new Student();
                students[i].obtainDetails();
            }

            // Display details of all students after input is complete
            System.out.println("\nAll Student Details:");
            for (int i = 0; i < countOfStudents; i++) {
                System.out.println("\nDetails for Student #" + (i + 1) + ":");
                students[i].displayStudentDetails(); // Display details for each student
                System.out.println();
            }
        } catch (Exception $exception) {
            System.out.println($exception.getMessage());
        }
    }
}
