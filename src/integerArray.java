//7.11 Write statements that perform the following one-dimensional-array operations:
//        a) Set the 10 elements of integer array counts to zero.
//        b) Add one to each of the 15 elements of integer array bonus.
//        c) Display the five values of integer array bestScores in column format.

public class integerArray {

    private static int[] counts;
    private  static  int[] bonus;
    private  static  int[] bestScores;

    public static void setToZero(int[] counts) {
        for(int element : counts){
            counts[element] = 0;
        }
    }

    public static void addOne(int[] bonus) {
        for(int number = 0; number < bonus.length; number++){
            bonus[number]+= 1;
        }
    }

//    public static void displayInColumn() {
//        System.out.printf("%6s %8s", "Index", "Numbers");
//
//        for(int number: bestScores){
//            System.out.printf("%6d %8d", number, bestScores[number]);
//        }
//    }
}
