import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int [][] matrix = new int[2][3];
        append(matrix);
        displayArray(matrix);
    }

    static void append(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Please, Enter your number: ");
                int temp = input.nextInt();
                matrix[row][column] = temp;
            }
        }
    }

    static  void displayArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%d ", matrix[row][column]);
            }
            System.out.println();
            System.out.println();
        }
    }


}
