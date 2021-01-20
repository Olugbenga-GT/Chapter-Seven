public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,7,2,9,11,7,9,12,10,6,8};
        int total  = 1;

        for(int myNumbers: numbers )
        { total *= myNumbers;
            System.out.printf("Cumulative product: %d", total );
            System.out.println();
        }
    }
}
