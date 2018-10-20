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

  public Integer responseChoice() {
    // hit/stay/quit
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("What would you like to do?\n 1. Hit (Draw Card)\n 2. Stay\n 3. Quit\n");
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader.close();
    return n;
  }

  public Integer calculateHand(ArrayList<Card> h) {
    int total = 0;
    for(int i=0; i<h.size();i++) {
      int g = h.get(i).getValue();
      total = total + g;
    }
    //System.out.println("Value is " + total);
    //taking in a parameter of an array list of card h
    //get.value and add together
//need to add like add things here
    return total;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();
    //intial card draw
    //userHand
    b.d.reset();
    b.d.shuffle();
    for (int i = 0; i < 2; i++) {
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }

    for (int i = 0; i < b.userHand.size(); i++) {
      System.out.println(b.userHand.get(i).getName());
    }
      int user_hand_total = b.calculateHand(b.userHand);
      System.out.println("Value is " + user_hand_total);

      //compHand
    for (int i=0; i < 2; i++) {
      Card q = b.d.drawCard();
      b.compHand.add(q);
    }

    //for (int i = 0; i < b.compHand.size(); i++) {
      System.out.println("Your opponent is showing a " + b.compHand.get(1).getName());
    //}
    //b.calculateHand(b.compHand);
    int comp_hand_total = b.calculateHand(b.compHand);
    System.out.println("Value is " + comp_hand_total);

    int n = b.responseChoice();

    if (n == 1) {
      System.out.println("You hit 1");
    }
    else if (n == 2) {
      System.out.println("You hit 2");
    }
    else if (n == 3) {
      System.out.println("You hit 3");
    }
    else {
      System.out.println("Do not recognize the number");
    }

//make sure to reset before shuffle deck
  }
}
