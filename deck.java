import java.util.*;

public class Deck {

  ArrayList<Card> cards; //main deck
  Arraylist<Card> discard; //what is given out

  public Card drawCard() {
    Card c=cards.get(0); //if you do drawCard five times then you will
    //not get the same cards because the card has been removed. drawCard has no
    //input (nothing in the ()) because the first card will be drawn
    cards.remove(0); /* remove from main deck*/
    discard.add(c); //counts as one we gave out (removed here)
    return c; //the method returns a card*/
  }

  public void reset() {
    cards.addAll(discard); //adds everything in discard back into the
    main deck
    discard.clear(); //gets rid of discard because all the discard goes
    //to the main deck
  }

  public void shuffle() {
    Random r=new Random();
    Arraylist<Card> shuffled=new Arraylist<Card>();

    int[] ar=r.ints(100000, 0, 52).distinct().toArray(); //creates a
    //string of integers that should contain all possibilities
    for (int i = 0; i < 52; i++) {
      shuffled.add(cards.get(ar[i]));
    }
  }
  cards=shuffled;
}

public Deck() {
  cards=new ArrayList<Card>();
  discard=new ArrayList<Card>();

  for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
        }
        else {
          suit = "Spades";
        }
        Card c = new Card();
        c.setName(num + " of " + suit);
        c.setValue(i);
        cards.add(c);
      }
    }

  }

}
