import Mathematics.*;

public class TestMatrix {
    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] sum = MatrixOperation.addMatrix(A, B, 2, 2);
        int[][] diff = MatrixOperation.subtractMatrix(A, B, 2, 2);

        System.out.println("Addition:");
        MatrixOperation.displayMatrix(sum, 2, 2);

        System.out.println("Subtraction:");
        MatrixOperation.displayMatrix(diff, 2, 2);
    }
}