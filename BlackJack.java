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
    int g = 0;
    for (int i=0; i < h.size(); i++) {
      if (h.get(i).getValue() > 10) { // if king/queen/jack set value to 10
        g = 10;
      }
      else {
        g = h.get(i).getValue();
      }
      total = total + g;
    }
    return total;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();
    //intial card draw
    //userHand
    b.d.reset();
    b.d.shuffle();
    System.out.println("Here is your hand:");
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

    System.out.println("Your opponent is showing a " + b.compHand.get(1).getName());
    int comp_hand_total = b.calculateHand(b.compHand);
    //System.out.println("Value is " + comp_hand_total);

    boolean runProgram = true;
    Scanner reader = new Scanner(System.in);  // Reading from System.in

    while (runProgram) {

    System.out.println("What would you like to do?\n 1. Hit (Draw Card)\n 2. Stay\n 3. Quit\n");
    //make sure this is an int
    int n = Integer.valueOf(reader.nextLine());
    // add java.lang.NumberFormatException handling using try catch

    if (n == 1) {
      b.userHand.add(b.d.drawCard());
      System.out.println("You drew a " + b.userHand.get(b.userHand.size()-1).getName());
      user_hand_total = b.calculateHand(b.userHand);
      System.out.println("New value is " + user_hand_total);
      //System.out.println("You hit 1"); //then go back to drawCard
    }
    else if (n == 2) {
      System.out.println("Your oppnent's hand is:\n");
      for (int i = 0; i < b.compHand.size(); i++) {
        System.out.println(b.compHand.get(i).getName());
      }
      System.out.println("Value is " + comp_hand_total);
      //System.out.println("you hit 2"); //then game progresses
    }
    else if (n == 3) {
      System.out.println("Cheers :)"); //program ends
      System.exit(0);
    }
    else {
      System.out.println("Please enter a valid option:\n"); //enter new input
    }

  }

  reader.close();

//make sure to reset before shuffle deck
  }
}
