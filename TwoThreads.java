
class MyNewThread implements Runnable{
    public void run(){
        for(char i='A'; i<='F'; i++){
            System.out.println(i);
        }
    }
}
public class TwoThreads implements Runnable {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(i);
        }
    }
    public static void main(String [] args){
        MyNewThread r1 = new MyNewThread();
        TwoThreads r2 = new TwoThreads();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}
