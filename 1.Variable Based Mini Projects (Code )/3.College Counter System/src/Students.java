public class Students {

    // Static Variable
    static int studentCounter = 0;

    // Non-Static Variable
    String name;
    int age;
    int rollNo;
    String email;
    String phone;
    String address;
    String city;
    String course;

    // Constructor
    public Students(
            String name
            , int age
            , String email
            , String phone
            , String address
            , String city
            , String course
            ,int rollNo
    ) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.course = course;
        this.rollNo = rollNo;

       // studentCounter
        studentCounter++;
    }

    public void print () {
        System.out.println("***** Students Details *****");
        System.out.println(
                " Name:" + name
                        +"\n" +" Age: " + age
                        +"\n" + " Email: " + email
                        +"\n" + " Phone: " + phone
                        +"\n" + " Address: " + address
                        +"\n" + " City: " + city
                +"\n" + " Course: " + course
                +"\n" + " Roll No: " + rollNo
                +"\n" + " Students Counter :" + studentCounter
        );
    }
}
