import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int [][] matrix = new int[2][3];

        iterate(matrix);
    }

    static void iterate(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Please, Enter your number: ");
                matrix[row][column] = input.nextInt();
                System.out.printf("%d  ", matrix[row][column]);
            }
            System.out.println();
        }
    }
}
