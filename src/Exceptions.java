import java.security.GeneralSecurityException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws Exception {
//        System.out.println("Please, Enter your Fee");
//        Scanner input = new Scanner(System.in);
        int [] charge = {3, 6, 8, 9, 21, 15};

        try {
           testException(10);
        }
        catch (Exception error){
//            System.out.println("Your array is not this long");
            System.out.println(error.getMessage());
        }
//        catch (ArrayIndexOutOfBoundsException error){
//            System.out.println("You can't access an inexistent element");
//        }
       for(int index = 0; index < charge.length; index++){
           System.out.printf("%d %n", charge[index]);
       }
//       testException(677);
    }

    public static void testException(int input) throws Exception {
//        System.out.println("How much weight did you move?");
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextInt();
        if(input >= 100){
            System.out.printf("You owe your distro %d dollars", input * 40);
        }
        else{
            throw new Exception ("Get your shit together bro! You slacking");
        }
    }
    int [] x = {4, 6, 2};
    int[] p  = {1, 2,3, 5};
    int q []  = {1, 2,3, 5}, y = {82, 21,33};

}
