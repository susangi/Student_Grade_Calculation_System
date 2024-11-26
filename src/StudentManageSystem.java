import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {
    protected static int choice;
    protected  static ArrayList<Student> students = new ArrayList<>(); // create array list for store students of insert

    public static void main(String[] args) throws InvalidMarkException {
        System.out.println("Welcome to the Student ManageSystem");
        selectOption();
    }

    public static void selectOption() throws InvalidMarkException {
        System.out.println();
        System.out.println("Please select one of the following options - ");
        System.out.println();
        System.out.println("1. Add Student");
        System.out.println("2. Calculate Student Grade");
        System.out.println("3. Show All Students");
        System.out.println("4. Exit Program");
        System.out.println();
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        actionWithChoice();
    }

    public static void actionWithChoice() throws InvalidMarkException {
        switch (choice) {
            case 1:
                Student newStudent = new Student();
                newStudent.obtainDetails();
                students.add(newStudent);
                System.out.println("Student added successfully!");
                newStudent.displayStudentDetails();
                selectOption();
                break;
            case 2:
                System.out.println("Please enter student mark - ");
                Scanner input = new Scanner(System.in);
                int grade = input.nextInt();
                System.out.println("Student grade is : " + CalculateGrade.calculateGrade(grade));
                System.out.println();
                selectOption();
                break;
            case 3:
                for (Student student : students) {
                    student.displayStudentDetails();
                    System.out.println();
                }
                selectOption();
                break;
            case 4:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
                selectOption();
                break;

        }
    }
}