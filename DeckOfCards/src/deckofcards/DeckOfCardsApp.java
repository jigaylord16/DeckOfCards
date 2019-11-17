//Jacob Gaylord
//jigaylord16@ole.augie.edu
//DeckOfCardsApp.java
//Desc:	  Display a user-specified number of cards from a deck of cards.
//Input:  The user enters a character (N/S) signaling whether the deck should be
//        shuffled or not, and an integer specifying the number of cards to be 
//        dealt via the keyboard.
//Output: A hand consisting of the user-specified number of cards dealt from a 
//        deck of cards.

import java.util.Scanner;

public class DeckOfCardsApp
{

	public static void main(String[] args)
	{
		Scanner f = new Scanner(System.in);
		DeckOfCards d = new DeckOfCards();
		System.out.print("New deck or shuffled deck? N/S: ");
		char ch = f.nextLine().charAt(0);
		if (ch == 'S' || ch == 's')
		{
			d.shuffle();
		}
		System.out.print("How many cards do you want? ");
		int n = f.nextInt();
		for (int i = 0; i < n; ++i)
		{
			System.out.println(d.deal());
		}
		int mid =(0+5)/2;
		System.out.println(mid);
	}
}
