public class EmployeeSalaryTracker {
    public static void main(String[] args) {
        System.out.println("Employee Salary Tracker is running...");

        Employee.companyName = "Tech Solutions Inc.";

        Employee emp1 = new Employee("kaushar",10000);
        Employee emp2 = new Employee("Sameer",20000);

        emp1.incrementsSalary();
        emp2.incrementsSalary();

        emp2.displayInfo();
        emp1.displayInfo();
    }
}