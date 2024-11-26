import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private String name;
    private String email;
    private int age;
    private String address;
    private int mark;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

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

    // get student details
    public void obtainDetails () throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();

        if(this.name.isEmpty()) {
            System.out.println("Could not student name empty");
            System.out.println("Enter student name: ");
            this.name = scanner.nextLine();
        }

        System.out.print("Enter Student Email: ");
        this.email = scanner.nextLine();

        if(this.email.isEmpty()) {
            System.out.println("Could not student email empty");
            System.out.println("Enter student email: ");
            this.email = scanner.nextLine();
        }

        System.out.print("Enter Student Age: ");
        this.age = scanner.nextInt();

        if(this.age < 0) {
            System.out.println("Please enter valid age: ");
            System.out.println("Enter student age: ");
            this.age = scanner.nextInt();
        }

        System.out.print("Enter Student Address: ");
        this.address = scanner.nextLine();

        if(this.address.isEmpty()) {
            System.out.println("Could not student address empty");
            System.out.println("Enter student Address: ");
            this.address = scanner.nextLine();
        }

        System.out.print("Enter Student Mark: ");
        this.mark = scanner.nextInt();

        if(this.mark < 0) {
            System.out.println("Please enter valid mark: ");
            System.out.println("Enter student mark: ");
            this.mark = scanner.nextInt();
        }
    }

    // display student details
    public void displayStudentDetails() throws InvalidMarkException {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Email: " + this.email);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Address: " + this.address);
        System.out.println("Student Mark: " + this.mark);

        String grade = CalculateGrade.calculateGrade(this.mark);

        System.out.println("Student Grade is : " + grade);
    }
}
