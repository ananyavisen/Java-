import java.io.*;

class DiffException {
    void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num == 1){
         throw new IOException("IOException Occured");
        }
        else{
            throw new ClassNotFoundException("Class Not Found Exception.");
        }
    }
}
class Example{
    public static void main(String args[]){
        try{
            DiffException obj= new DiffException();
            obj.myMethod(1);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
