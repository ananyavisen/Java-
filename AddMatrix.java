import java.util.*;

public class AddMatrix {
    public static void main(String args[]){ 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter order of matrix: ");
      int order=sc.nextInt();
      int [][] matrix1= new int[order][order];
      int [][] matrix2= new int[order][order];
      int [][] result= new int[order][order];
      System.out.println("Enter elements of array 1: ");
      for(int i=0;i<order;i++){
        for(int j=0; j<order; j++){
            matrix1[i][j]=sc.nextInt();
        }
      }
       System.out.println("Enter elements of array 2: ");
      for(int i=0;i<order;i++){
        for(int j=0; j<order; j++){
            matrix2[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<order;i++){
        for(int j=0; j<order; j++){
            result[i][j]=matrix1[i][j]+matrix2[i][j];
        }
      }
      System.out.println("---------Result----------");
      for(int i=0;i<order;i++){
        for(int j=0; j<order; j++){
           System.out.print(result[i][j] + " ");
        }
        System.out.println();
      }
      sc.close();
    }
}
