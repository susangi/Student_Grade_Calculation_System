import java.util.Scanner;

public class Student {
    private String name;
    private String email;
    private int age;
    private String address;
    private int mark;
    private String grade;

    // default constructor
    public Student() {}

    //    parameterize constructor
    public Student (String name, String email, int age, String address, int mark) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.mark = mark;
    }

    public void obtainDetails () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Student Email: ");
        this.email = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        this.age = scanner.nextInt();
        System.out.print("Enter Student Address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter Student Mark: ");
        this.mark = scanner.nextInt();
    }

    public void displayStudentDetails() throws InvalidMarkException {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Email: " + this.email);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Address: " + this.address);
        System.out.println("Student Mark: " + this.mark);

        this.grade = CalculateGrade.calculateGrade(this.mark);

        System.out.println("Student Grade is : " + this.grade);
    }
}
