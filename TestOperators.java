public class TestOperators {
    int op1, op2;
    public TestOperators(int a, int b){
      op1=a;
      op2=b;
    }
    void add(){
        int res=op1+op2;
        System.out.println("addition: " + res );
    }
    void subtract(){
        int res=op1-op2;
        System.out.println("subtraction: " + res);
    }
    void divide(){
        int res=op1/op2;
        System.out.println("division: " + res);
    }
    void multiply(){
        int res=op1*op2;
        System.out.println("multiplication: " + res);
    }
    void Comparison(){
        boolean right = op1>op2;
        System.out.println("operand 1 greater than operand 2: " + right);
    }
    void BitwiseOR(){
        int res=op1|op2;
        System.out.println("Bitwise OR of opeand 1 and 2: "+ res);
    }
    void mod(){
        int res=op1%op2;
        System.out.println("Modulus of opeand 1 and 2: "+ res);
    }
    public static void main(String args[]){
        TestOperators obj=new TestOperators(6, 3);
        obj.add();
        obj.multiply();
        obj.divide();
        obj.subtract();
        obj.Comparison();
        obj.BitwiseOR();
        obj.mod();
    }
}
