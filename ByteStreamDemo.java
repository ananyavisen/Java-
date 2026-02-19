import java.io.IOException;
import java.io.File;
public class ByteStreamDemo{
    public static void main(String args[]){
        try{
            File f= new File("StudentMarks.txt");
            if(f.createNewFile()){
                System.out.println("File Created Succesfully");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error Occured.");
        }
       
    }
}