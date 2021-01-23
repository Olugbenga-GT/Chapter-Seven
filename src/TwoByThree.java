public class TwoByThree {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];

        Matrix.iterate(matrix);
        System.out.println();

        System.out.printf("%d  %d  %d", matrix[0][0], matrix[0][1], matrix[0][2] );
        System.out.printf("%d%n %d ", matrix[0][2], matrix[1][2] );

        matrix[0][1] = 0;
        System.out.printf("%d", matrix[0][1] );

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = 0;
                System.out.printf("%d  ", matrix[row][column]);
            }
            System.out.println();
        }



    }
}