public class Main {
    public static void main(String[] args) {

        // Object Create 
        Students students = new Students(
                "Kaushar",
                "Ali",
                24,
                "Java",
                90);
        students.print();

        Students students1 = new Students(
                "Imam",
                "Hasan",
                22,
                "Pythone",
                55);
        students1.print();
    }
}