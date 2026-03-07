import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Students : ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Student : " + i );
            System.out.println("Enter Student name : ");
            String studentName = input.nextLine();

            System.out.println("Enter Student Age : ");
            int studentAge = input.nextInt();
            input.nextLine();

            System.out.println("Enter Student Email : ");
            String studentEmail = input.nextLine();

            System.out.println("Enter Student Phone : ");
            String studentPhone = input.nextLine();

            System.out.println("Enter Student Address : ");
            String studentAddress = input.nextLine();

            System.out.println("Enter Student State : ");
            String studentState = input.nextLine();


            System.out.println("Enter Student Course : ");
            String studentCourse = input.nextLine();

            System.out.println("Enter Student roll no : ");
            int studentRollNo = input.nextInt();
            input.nextLine();

            Students students = new Students(
                    studentName,
                    studentAge,
                    studentEmail,
                    studentPhone,
                    studentAddress,
                    studentState,
                    studentCourse,
                    studentRollNo
            );
            students.print();
        }

        System.out.println(
                "\n Total Students in Collage = "
                + Students.studentCounter
        );

        input.close();

    }
}