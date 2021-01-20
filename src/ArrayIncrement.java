public class ArrayIncrement {
    public static void main(String[] args) {

        //RAISING AN UNINITIALIZED ARRAY BY THREE FOR EACH ITERATION

        int[] tim = new int[15];
        for(int index = 0; index < tim.length; index++ ){
            tim[index] = (index * 3) + 3;
        }
        System.out.printf("%s %8s %n", "Index", "Value");

        for(int index = 0; index < tim.length; index++)     {
            System.out.printf("%5d %8d %n", index, tim[index] );
        }


    }
}
