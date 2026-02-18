public class CustomClass extends Exception{
    static String notFound = "Product Key Invalid, Try other keys";
    public CustomClass(){
        super(notFound);
    }
}
class DemoCustomException{
    static String[] ProductList={
        "Phone", "Washing Machine", "Laptop", "Geyser", "Television"
    };
    static int ValidKey= ProductList.length;
    public static void bring(int productNo) throws CustomClass{
        if(productNo>=ValidKey || productNo < 0)
             throw new CustomClass();
        else
            System.out.println(ProductList[productNo-1]);
    }
    public static void main(String[] args) throws CustomClass{
     System.out.println("Fetching Some Products...");
     bring(2);
     bring(6);
    }
}
