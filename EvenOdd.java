class EvenOddThreads {
    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even Thread: " + i);
                try {
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd Thread: " + i);
                try {
                    Thread.sleep(5000); 
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}
