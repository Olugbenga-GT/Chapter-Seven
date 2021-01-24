import java.util.Scanner;

public class ArrayMinimum {
    public static void main(String[] args) {

        System.out.println("I help you determine the least number in your array \n");

        int[][] gastt = new int[2][3];

        append(gastt);
        System.out.println(" \n Your array is: ");
        displayArray(gastt);
    }

    static void append(int[][] gastt) {
        Scanner input = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int temp = 0;
        for (int row = 0; row < gastt.length; row++) {
            for (int column = 0; column < gastt[row].length; column++) {
                System.out.println("Please, Enter your number: ");
                temp = input.nextInt();
                gastt[row][column] = temp;
            if(temp < smallest ){ smallest = temp;}
            }
        }
        System.out.printf("The minimum number in your array is %d ", smallest);
    }

    static void displayArray(int[][] gastt) {
        for (int row = 0; row < gastt.length; row++) {
            for (int column = 0; column < gastt[row].length; column++) {
                System.out.printf("%d ", gastt[row][column]);
            }
            System.out.println();
        }
    }

}

