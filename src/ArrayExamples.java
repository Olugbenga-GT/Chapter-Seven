import java.security.SecureRandom;

public class  ArrayExamples
{
    public static void main(String[] args)
    {
                   //ROLLING A DICE
        SecureRandom randomValue = new SecureRandom();
        int frequency[] = new int[7];
        for(int rolls = 1; rolls <= 6000000; rolls++)
        {
            ++frequency[1 + randomValue.nextInt(6)];
        }
            System.out.printf("%s %10s %n", "Face", "Frequency");
        for(int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }

    }
}
