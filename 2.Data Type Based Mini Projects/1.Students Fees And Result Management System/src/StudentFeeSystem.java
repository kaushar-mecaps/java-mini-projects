import java.util.Scanner;

/**
 * This program calculates the total marks, percentage, grade, pass/fail status,
 * and fee details for a student based on their personal
 * information and subject marks.
 */
public class StudentFeeSystem {
    public static void main(String[] args) {
        /**
         * Variables to store student information, subject marks,
         * total marks, percentage,
         * grade, pass/fail status, and fee details.
         */
        String name;
        int rollNo;
        byte age;
        char gender;

        /**
         * Variables to store marks for each subject, total marks, and percentage.
         */
        int hindi;
        int english;
        int mathematic;
        int science;
        int socalScience;
        int drawing;

        /**
         * Variable to store total marks and percentage.
         */
        int totalMarks;
        float percentage;

        Scanner input = new Scanner(System.in);
        /**
         * Collecting student personal information and subject marks from user input.
         */
        System.out.println("-------Student Personal Information:--------");
        System.out.print("Enter Name        : ");
        name = input.nextLine();
        System.out.print("Enter Roll Number : ");
        rollNo = input.nextInt();
        System.out.print("Enter Age         : ");
        age = input.nextByte();
        System.out.print("Enter Gender (M/F): ");
        gender = input.next().charAt(0);

        /**
         * Collecting marks for each subject and calculating
         * total marks and percentage.
         */
        System.out.println("-------Student Subject Details:---------");
        System.out.print("Enter Marks in Hindi: ");
        hindi = input.nextInt();
        System.out.print("Enter Marks in english: ");
        english = input.nextInt();
        System.out.print("Enter Marks in mathematic: ");
        mathematic = input.nextInt();
        System.out.print("Enter Marks in science: ");
        science = input.nextInt();
        System.out.print("Enter Marks in socalScience: ");
        socalScience = input.nextInt();
        System.out.print("Enter Marks in drawing: ");
        drawing = input.nextInt();

        totalMarks =
                hindi + english + mathematic + science + socalScience + drawing;
        percentage = (totalMarks / 600.0f) * 100;

        /**
         * Displaying student marks details, grade, pass/fail status,
         * and fee details.
         */
        System.out.println("--------Student Marks details:--------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        /**
         * Determining and displaying the grade based on the percentage.
         */
        System.out.println("--------Student Grade details:----------");
        if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 45) {
            System.out.println("Grade: C");
        } else if (percentage >= 33) {
            System.out.println("Grade: D");
        } else {
            System.out.println("FAIL");
        }

        /**
         * Determining and displaying whether the student has passed or failed
         * based on the percentage.
         */
        System.out.println("----------Student is passed: ----------");
        boolean isPassed;
        if (percentage >= 33) {
            isPassed = true;
        } else {
            isPassed = false;
        }
        System.out.println("Is the student passed: " + isPassed);

        /**
         * Calculating and displaying the fee details based on the percentage.
         * If the percentage is 75 or above,
         * the student receives a 20% scholarship.
         */
        System.out.println("----------Student Fee details:-----------");
        int baseFees = 30000;
        System.out.println("Base Fees: " + baseFees);
        double discount;
        double finalFees;
        if (percentage >= 75) {
            System.out.println("Scholarship: 20%");
            discount = baseFees * 20 / 100;
            System.out.println("Discount Amount: " + discount);
            finalFees = baseFees - discount;
            System.out.println("Final Fess : " + finalFees);
        } else {
            System.out.println("Scholarship: 0%");
            discount = 0;
            System.out.println("Discount Amount: " + discount);
            finalFees = baseFees - discount;
            System.out.println("Final Fess : " + finalFees);
        }
        /**
         * Closing the scanner to prevent resource leaks.
         */
        input.close();
    }
}
