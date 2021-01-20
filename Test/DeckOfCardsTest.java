public class DeckOfCardsTest
{
    public static void main(String[] args)
    {
     DeckOfCards myDeckOfCards = new DeckOfCards();
//     To Pick a random number
     myDeckOfCards.shuffle();
     for(int newCard = 1; newCard <= 52; newCard++)
     {
         System.out.printf("%-19s", myDeckOfCards.dealCard());

         if(newCard % 4 == 0)
         {
             System.out.println();
         }
     }
    }
}
