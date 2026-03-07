public class Employee {

    // Instance Variables
    String name ;
    double salary ;

    // Static Variable
   static String companyName;

   public Employee(String name,double salary){
         this.name = name;
            this.salary = salary;
   }

    public void incrementsSalary(){
       // Local Variable
       double increment = 2000;

       salary = salary + increment;
   }

   void displayInfo(){
       System.out.println("Employee Name: " + name);
       System.out.println("Employee Salary: " + salary);
       System.out.println("Company Name: " + companyName);
       System.out.println("---------------------------");
   }
}
