class D extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From D: "+ i);
        }
        System.out.println("exit D");
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From B: "+ i);
        }
        System.out.println("exit B");
    }
}
class C extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From C: "+ i);
        }
        System.out.println("exit C");
    }
}

public class ThreadDemoRun {
    public static void main(String[] args) {
        new D().start();
        new B().start();
        new C().start();
    }
}
