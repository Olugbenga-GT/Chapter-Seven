public class Practices {
    public static void main(String[] args) {
       int [][] matrix= new int [3][3];
//       It contains 9 elements
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = row + column + 1;
                System.out.printf("%d  " , matrix[row][column]);
                total+= matrix[row][column];
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("Sum of values in the 3 by 3 array is %d", total);
    }
}
