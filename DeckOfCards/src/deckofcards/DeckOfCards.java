//Jacob Gaylord
//jigaylord16@ole.augie.edu
//DeckOfCards.java
//A DeckOfCards object represents a deck of ordinary playing cards.  The top card is dealt each 
//time the method deal is called.  A dealt card will not be reused until the DeckOfCards is shuffled.
import java.util.Random;
public class DeckOfCards
{
	enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};	
	enum Suit {SPADE, CLUB, HEART, DIAMOND};
	private String[] deck;
	private int top;
	//Post:	This DeckOfCards initialized to a new deck; the cards are ordered from AceSpade to 
	//		KingDiamond as in a new deck; top initialized to 0.
	public DeckOfCards()
	{
		deck = new String[52];
		for (int i = 0; i < 4; i++)
		{
			for(Rank r : Rank.values())
			{
				switch(r)
				{
					case ACE : deck[0 + 13 * i] = "Ace"; break;
					case TWO : deck[1 + 13 * i] = "Two"; break;
					case THREE : deck[2 + 13 * i] = "Three"; break;
					case FOUR : deck[3 + 13 * i] = "Four"; break;
					case FIVE : deck[4 + 13 * i] = "Five"; break;
					case SIX : deck[5 + 13 * i] = "Six"; break;
					case SEVEN : deck[6 + 13 * i] = "Seven"; break;
					case EIGHT : deck[7 + 13 * i] = "Eight"; break;
					case NINE : deck[8 + 13 * i] = "Nine"; break;
					case TEN : deck[9 + 13 * i] = "Ten"; break;
					case JACK : deck[10 + 13 * i] = "Jack"; break;
					case QUEEN : deck[11 + 13 * i] = "Queen"; break;
					case KING : deck[12 + 13 * i] = "King"; break;
				}
			}
		}
		for (int i = 0; i < 13; i++)
		{	
			for(Suit s : Suit.values())
			{
				switch(s)
				{
					case SPADE : deck[i] = deck[i].concat("Spade"); break;
					case CLUB : deck[i+13] = deck[i+13].concat("Club"); break;
					case HEART : deck[i+26] = deck[i+26].concat("Heart"); break;
					case DIAMOND : deck[i+39] = deck[i+39].concat("Diamond"); break;
				}
			}
		}
		top = 0;
	}
	//Post:	This DeckOfCards thoroughly shuffled; top set to 0.
	public void shuffle()
	{
		Random rand = new Random();
		for (int i = 0; i < 1000; ++i)
		{
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			String temp = deck[x];
			deck[x] = deck[y];
			deck[y] = temp;
		}
		top = 0;
	}
	//Post:	top incremented by 1.
	//Return:	The top card of this DeckOfCards as a String such as "AceHeart", "TwoSpade", 
	//	"TenDiamond", "KingClub".  If top >=52, "NoMoreCard" is returned.
	public String deal()
	{
		String card = "";
		if (top >= 52)
		{
			card = "NoMoreCard";
		} 
		else
		{
			card = deck[top];
		}
		top++;
		return card;
	}
}
