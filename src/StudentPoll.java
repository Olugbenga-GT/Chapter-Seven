public class StudentPoll
{
    public static void main(String[] args)
    {
        int[] responses = {3, 6, 5, 3, 4 , 2, 6 ,4 , 3, 3, 3, 2, 5, 4, 7, 7, 6 , 14, 9, 9, 8, 6, 5};
        int[] frequency = new int[6];

        for(int answer = 0; answer < responses.length; answer++)
        {
            try {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException error)
            {
                System.out.println(error);
                System.out.printf("  responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%10%n", "RATING", " FREQUENCY");

        for(int rating = 1; rating < frequency.length; rating++)
        {
            System.out.printf("%6d %10d %n", rating , frequency[rating]);
        }

    }
}
