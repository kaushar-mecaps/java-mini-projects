import java.util.Scanner;

public class OnlineExameCalculator {

    // Result Calculator Method
    public void calculateResult(){

        Scanner sr = new Scanner(System.in);

        System.out.println("Enter the Total Marks:");
        int totalMarks = sr.nextInt();

        System.out.println("Enter the Passing Marks Marks:");
        int passingMarks = sr.nextInt();

        System.out.println("Enter the Obtained Marks:");
        double obtainedMarks = sr.nextDouble();

        // Percentage Calculate
         double percentage = ( obtainedMarks/totalMarks )*100 ;

         // Pass / Fail Logic
        String result;
        if (obtainedMarks >= passingMarks){
            result = "Pass";
        }else {
            result = "Faile";
        }

        // OutPut
        System.out.println(
                "Total Marks = " + totalMarks + "\n"
        + "Passing Marks = " + passingMarks + "\n"
        + "Obtained Marks = " + obtainedMarks + "\n"
        + "Percentage = " + percentage + "\n"
                + "Result = " + result
        );


    }
}
