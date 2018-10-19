//due sometime
import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;//setting up a thing for the userHand
  ArrayList<Card> compHand;//setting up a thing for the computer

  public Blackjack() {
    d = new Deck(); //defines what the deck is and this is from the deck.java
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();
  }

  public Integer calculateHand(ArrayList<Card> h) {
    int total = 0;
    for(int i=0; i<h.size();i++) {
      int g = h.get(i).getValue();
      total = total + g;
    }
    System.out.println(total);
    //taking in a parameter of an array list of card h
    //get.value and add together
//need to add like add things here
    return total;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();

    b.d.reset();
    b.d.shuffle();
    for (int i = 0; i < 4; i++) {
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }
    b.calculateHand(b.userHand);
    
    for (int i = 0; i < b.userHand.size(); i++) {
      System.out.println(b.userHand.get(i).getName());
    }


//make sure to reset before shuffle deck
  }
}
