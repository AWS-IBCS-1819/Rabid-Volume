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

  //public FIX THIS LATER cardName(ArrayList<Card> h){
  //  String name;
  //  for (int i = 0; i < h.size(); i++) {
  //    name = h.get(i).getName();
  //  }
//    return name;
//  }
  //could make a method that print card names given a hand

  public static void main(String[] args) {

    Blackjack b = new Blackjack();
    //intial card draw
    //userHand
    b.d.reset(); //make sure to reset before shuffle deck
    b.d.shuffle();
    System.out.println("Here is your hand:");
    for (int i = 0; i < 2; i++) {
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }

    for (int i = 0; i < b.userHand.size(); i++) {
      System.out.println(b.userHand.get(i).getName());
    }
//b.cardName(userHand)
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

    //while loop is for main 1.2.3
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
    else if (n == 2) { //if we stay then dealer logic starts
      System.out.println("Your oppnent's hand is:\n");
      for (int i = 0; i < b.compHand.size(); i++) {
        System.out.println(b.compHand.get(i).getName());
      }
      System.out.println("Value is " + comp_hand_total);
      break;
      //System.out.println("you hit 2"); //then game progresses
    }
    else if (n == 3) {
      System.out.println("Cheers :)"); //program ends completly
      System.exit(0);
    }
    else {
      System.out.println("Please enter a valid option:\n"); //enter new input
    }

  }
  reader.close();

  //while loop for what happens after (compHand)
  //dealer logic if <= 16 drawCard() else stay
  //dealer logic is another while loop if over 16 or value > 21 then break loop
  boolean dealerProgram = true;

  while (dealerProgram) {

  if (comp_hand_total <= 16) { //MAKE A METHOD FOR THIS BECAUSE IT IS DOES NOT GO FOR MY AESTHETIC
    b.compHand.add(b.d.drawCard());
    System.out.println("Dealer drew a " + b.compHand.get(b.userHand.size()-1).getName());
    comp_hand_total = b.calculateHand(b.compHand);
    System.out.println("New value is " + comp_hand_total);
  }
  else if (comp_hand_total > 17){
    System.out.println("Dealer stays");
    break;
  }
}

  }
}
//Need Scanner class for reader input (have done this)
//if you choose option 1 then will need to loop again- Scanner will be inside of loop
//indefinite loop- while loop until hit 2 or 3 or bust
//if userHand busts then skip compHand
//two while loops for userHand and compHand- compHand is outside of userHand loop
//then resolve game
