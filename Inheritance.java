class Person {
    String name;
    int age;
    void setPersonDetails(String n, int a) {
        name = n;
        age = a;
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class NewStudent extends Person {
    int rollNo;
    String course;
    void setStudentDetails(int r, String c) {
        rollNo = r;
        course = c;
    }
    void displayStudent() {
        displayPerson();   
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
 class Main {
    public static void main(String[] args) {

        NewStudent s = new NewStudent();
        s.setPersonDetails("Ananya", 20);
        s.setStudentDetails(101, "B.Tech CSE");
        System.out.println("Student Details:");
        s.displayStudent();
    }
}
