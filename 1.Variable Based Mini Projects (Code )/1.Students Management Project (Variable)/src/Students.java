public class Students {

    // Instance Variable
    private String firstName;
    private String lastName;
    private int age;
    private String course;
    private double marks;

    // Constructor
    public Students(String firstName, String lastName,
                    int age, String course, double marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }


    // Getter Setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }


    // Print Statement
    public void print(){
        System.out.println("\n" +
                "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Age: " + age + "\n" +
                        "Course: " + course + "\n" +
                        "Marks: " + marks + "\n"
        );
    }
}
