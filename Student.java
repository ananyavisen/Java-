public class Student {
    String name;
    int rollNo;
    String branch;
    Student(String name, int rollNo, String branch){
        this.name=name;
        this.rollNo=rollNo;
        this.branch=branch;
    }
    void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Roll No.: "+ rollNo);
        System.out.println("Branch: "+ branch);
    }
    public static void main(String[] args) {
        Student s1=new Student("Ananya", 243201188, "CSE");
        Student s2=new Student("Ispitha", 243201859, "Mech");
        s1.showDetails();
        s2.showDetails();
    }
}
