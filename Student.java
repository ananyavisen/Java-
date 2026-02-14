public class Student {
    String name;
    int rollno;
    String branch;
    Student(String name, int rollno, String branch){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
    }
    void showDetails(){
        System.out.println("A student named " + name + " who has " + rollno + " from "+ branch + ".");
    }
    public static void main(String[] args) {
        Student s1=new Student("Ananya", 188, "CSE");
        Student s2=new Student("Ispitha", 859, "Mech");
        s1.showDetails();
        s2.showDetails();
    }
}
