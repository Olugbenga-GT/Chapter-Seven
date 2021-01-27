public class ArrayIndex {
    public static void main(String[] args) {

//        PRINTING THE INDEX VALUE OF A GIVEN ARRAY


        int[] array = {34,23,65,78,100,41, 76,39,85,11};
        System.out.printf("%s %8s %n", "Index", "Value");
        for(int index = 0; index < array.length; index++){
            System.out.printf("%5d %8d %n", index, array[index]);
        }
    }
}
