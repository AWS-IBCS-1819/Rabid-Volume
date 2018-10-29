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

  public Integer calculateHand(ArrayList<Card> h) { //method for getting card total
    int total = 0;
    int g = 0;
    for (int i=0; i < h.size(); i++) {
      if ((h.get(i).getValue() == 11) || (h.get(i).getValue() == 12) || (h.get(i).getValue() == 13)) { // complying with Blackjack rules
        g = 10;
      }
      else if (h.get(i).getValue() == 1) {
        g = 11;
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

    while (true) {

    boolean runProgram = true;
    boolean bust = false;

    //intial card draw
    //userHand
    b.d.reset(); //make sure to reset before shuffle deck
    b.d.shuffle();

    System.out.println("\nWelcome to Blackjack!\n");
    System.out.println("Here is your hand:\n");

    //drawCard function for userHand
    for (int i = 0; i < 2; i++) {
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }

    for (int i = 0; i < b.userHand.size(); i++) {
      System.out.println(b.userHand.get(i).getName());
    }

    int user_hand_total = b.calculateHand(b.userHand);
    System.out.println("\nValue is " + user_hand_total);

    // if user_hand_total equals 21 here, user wins right away
    if (user_hand_total == 21) {
      runProgram = false;
      bust = true;
      System.out.println("Congrats");
    }

      // drawCard functionality of compHand
    for (int i=0; i < 2; i++) {
      Card q = b.d.drawCard();
      b.compHand.add(q);
    }

    System.out.println("\nYour opponent is showing a " + b.compHand.get(1).getName());
    int comp_hand_total = b.calculateHand(b.compHand);


    Scanner reader = new Scanner(System.in);  // Reading from System.in and get User input

    //while loop is for main 1/2/3

    while (runProgram) {

    System.out.println("\nWhat would you like to do?\n 1. Hit (Draw Card)\n 2. Stay\n 3. Quit\n");

    int n = 0;

    try {
      n = reader.nextInt(); //added a try-catch loop to catch human errors
    }
    catch (InputMismatchException ime){
      boolean bError = true;
      while (bError) {
        if (reader.hasNextInt()) {
          n = reader.nextInt();
        }
        else {
          System.out.println("Please enter \n 1. Hit (Draw Card)\n 2. Stay\n 3. Quit\n");
          reader.next();
          continue;
        }
        bError = false;
      }
    }

    if (n == 1) {
      b.userHand.add(b.d.drawCard());
      System.out.println("\nYou drew a " + b.userHand.get(b.userHand.size()-1).getName());
      user_hand_total = b.calculateHand(b.userHand);
      System.out.println("\nNew value is " + user_hand_total);
        if (user_hand_total > 21){
          System.out.println("\nOh no! You bust!\n");
          bust = true;
          break;
        }
        else if (user_hand_total == 21){
          System.out.println("\nCongrats\nYou win");
          bust = true;
          break;
        }
      // the only way to exist 1/2/3 loop is to overdraw or hit 2
    }
    else if (n == 2) { //if we stay (hit 2) then dealer logic starts
      System.out.println("Your oppnent's hand is:\n");
      for (int i = 0; i < b.compHand.size(); i++) {
        System.out.println(b.compHand.get(i).getName());
      }
      System.out.println("\nValue is " + comp_hand_total); //the start of dealer logic
      if (comp_hand_total == 21) { //need to have this twice because the first time is within brackets
        System.out.println("\nDealer wins!");
        bust = true;
        break;
      }
      if (comp_hand_total > 21) {
        System.out.println("\nDealer Busts\nYou win!");
        bust = true;
        break;
      }
      else if ((comp_hand_total >= 17) && (comp_hand_total < 21)){
        System.out.println("\nDealer stays\n");
        break;
      }
      else {
        break;
      }
      //then game progresses- go to dealerlogic
      }

    else if (n == 3) {
      System.out.println("Cheers :)"); //program ends completly
      bust = true;
      System.exit(0);
    }
    else {
      System.out.println("Please enter a valid option:"); //enter new input
    }

  } // end of asking user while loop

if (bust == false) { //have this if statement here so that the dealer logic will only happen when userHand does not bust
  while (comp_hand_total <= 16) { //need to be able to draw more than one hand
  b.compHand.add(b.d.drawCard());
  System.out.println("\nDealer drew a " + b.compHand.get(b.compHand.size()-1).getName());
  comp_hand_total = b.calculateHand(b.compHand);
  System.out.println("\nNew value is " + comp_hand_total);

  if (comp_hand_total == 21) { //what to do in the special cases
    System.out.println("\nDealer wins!");
    bust = true;
  }
  if (comp_hand_total > 21) {
    System.out.println("\nDealer Busts\nYou win!");
    bust = true;
  }
  else if ((comp_hand_total >= 17) && (comp_hand_total < 21)){
    System.out.println("\nDealer stays\n");
  }
}
    //resolving the game
  if ((user_hand_total <= comp_hand_total) && (comp_hand_total <= 21)) {
    System.out.println("You lose!");
  }
  else if (user_hand_total > comp_hand_total) {
    System.out.println("You win!");
    }

}
//play again function
b.userHand.clear(); //clear both hands to assure no carry over from last game
b.compHand.clear();

System.out.println("\nDo you want to play again?\nY/N");
  String george = reader.next();
    if (george.equalsIgnoreCase("n")) {
      System.out.println("Cheers!");
      break;
    }
  } //end of big while loop

  } //end of main argument
} //end bracket of entire thing
