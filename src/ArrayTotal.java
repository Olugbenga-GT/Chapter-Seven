import java.util.Scanner;

public class ArrayTotal {
    public static void main(String[] args) {

        System.out.println("I help you print the first line of your array \n");

        int[][] gastt = new int[2][3];
        append(gastt);
        displayArray(gastt);

        System.out.println("The summation of your array is: \n");
        ArraySummation(gastt);
    }

    static void append(int[][] gastt) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        for (int row = 0; row < gastt.length; row++) {
            for (int column = 0; column < gastt[row].length; column++) {
                System.out.println("Please, Enter your number: ");
                temp = input.nextInt();
                gastt[row][column] = temp;
            }
        }
    }

    static void displayArray(int[][] gastt) {
        for (int row = 0; row < gastt.length; row++) {
            for (int column = 0; column < gastt[row].length; column++) {
                System.out.printf("%d ", gastt[row][column]);
            }
            System.out.println();
        }
    }

    static void ArraySummation(int[][] gastt) {
        int total  = 0;
        for (int row = 0; row < gastt.length; row++) {
            for (int column = 0; column < gastt[row].length; column++) {
                total+= gastt[row][column];
            }
        }
        System.out.printf("%d", total);
    }
}
