class New{
    String name;
    int age;
    public New(String n, int a){
        name=n;
        age=a;
    }
    public void display(){
        //int x=10;
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
   
    }
    
    public static void main(String args[]){
     New p1=new New("Ananya", 20);
     New p2=new New("Anekaaaa", 34);
     p1.display();
     p2.display();
    
    }
}