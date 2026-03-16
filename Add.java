@FunctionalInterface
interface Additions{
 int sum(int a, int b);
}

class Addition {
    public static void main(String args []){
     Additions add1= (n,m) -> n+m;
      System.out.println(add1.sum(3,7));
    }
}
