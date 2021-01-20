import java.security.SecureRandom;

public class DeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int numberOfCards= 52;
    private  static final SecureRandom randomNumbers = new SecureRandom();

    public  DeckOfCards()
    {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[numberOfCards];
        currentCard = 0;

//        Fill the deck with Cards Objects
        for (int count = 0; count < deck.length; count++)
        {
            deck[count] = new Card( faces[ count % 13], suits[count / 13]);
        }
    }

        // To shuffle the cards over again
    public void shuffle()
    {
        currentCard = 0; // Makes next card picking start at zero.
        // For each card, pick another card 0 - 51 and swap them.
        for(int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(numberOfCards);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

//    Deal one card
    public Card dealCard()
    {
        if (currentCard < deck.length) {
            return  deck[currentCard++];
        }
        else {
               return null;
            }
    }


}
