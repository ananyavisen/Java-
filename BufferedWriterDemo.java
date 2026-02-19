import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriterDemo {
    public static void main(String args[]){
        String data="This is the data in the ouput file.";
        try{
            FileWriter file=new FileWriter("output.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            System.out.println("Data Written on file");
            output.close();
        }
        catch(Exception e){
          e.getStackTrace();
        }
    }
}
