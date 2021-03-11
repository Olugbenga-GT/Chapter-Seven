import java.util.Arrays;

public class ArraysManipulations {
    public static void main(String[] args) {

//        Sorting this array
        double[] doubleArray = {8.4, 2.5, 1.8, 9.7, 13.6,23.6,2.40};
        Arrays.sort(doubleArray);
        System.out.printf("%n a sorted array of doubles: ");
        for(double decimal : doubleArray){
            System.out.printf("%.1f,  ", decimal);
        }

//        Filling this Array
        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 15);
        displayArray(filledArray, "Filled array");

//        Copy an array into another array
        int[] newArray = {1,2,3,4,5,6,7,8,9,0,11,12,123,134,156};
        int[] copiedArray = new int[newArray.length];
        displayArray(copiedArray, "Initial copied array before copy is done \n");
        System.arraycopy(newArray, 0, copiedArray, 0,  newArray.length);
        displayArray(newArray, "Array to be copied \n");
        displayArray(copiedArray, "Copied After copying is done \n");

//        compare two integers
        boolean b = Arrays.equals(newArray, copiedArray);
        System.out.printf("%n%n newArray   %s   copiedArray%n",(b ? "==" : "!=") );
    }

//    






    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s ", description);
        for(int number: array){
            System.out.printf("%d ", number);
        }
    }
}
