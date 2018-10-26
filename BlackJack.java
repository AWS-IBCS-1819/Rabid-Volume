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
      if ((h.get(i).getValue() == 11) || (h.get(i).getValue() == 12) || (h.get(i).getValue() == 13)) { // if king/queen/jack set value to 10
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
    boolean runProgram = true;

    while (true){

    //intial card draw
    //userHand
    b.d.reset(); //make sure to reset before shuffle deck
    b.d.shuffle();

    System.out.println("\nWelcome to Blackjack!\n");
    System.out.println("Here is your hand:");
    for (int i = 0; i < 2; i++) {
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }

    for (int i = 0; i < b.userHand.size(); i++) {
      System.out.println(b.userHand.get(i).getName());
    }

    int user_hand_total = b.calculateHand(b.userHand);
    System.out.println("\nValue is " + user_hand_total);

    // add code if user_hand_total equals 21 here, user wins
    if (user_hand_total == 21) {
      runProgram = false;
      System.out.println("Congrats");
    }

      //compHand
    for (int i=0; i < 2; i++) {
      Card q = b.d.drawCard();
      b.compHand.add(q);
    }

    System.out.println("\nYour opponent is showing a " + b.compHand.get(1).getName());
    int comp_hand_total = b.calculateHand(b.compHand);
    //System.out.println("Value is " + comp_hand_total);

    Scanner reader = new Scanner(System.in);  // Reading from System.in

    //while loop is for main 1.2.3
    while (runProgram) {

    System.out.println("\nWhat would you like to do?\n 1. Hit (Draw Card)\n 2. Stay\n 3. Quit\n");
    //make sure this is an int
    int n = reader.nextInt();
    //Integer.valueOf(reader.nextLine());
    // add java.lang.NumberFormatException handling using try catch
boolean bust = false;
if (user_hand_total > 21){
  Bust = true
}
    if (n == 1) {
      b.userHand.add(b.d.drawCard());
      System.out.println("\nYou drew a " + b.userHand.get(b.userHand.size()-1).getName());
      user_hand_total = b.calculateHand(b.userHand);
      System.out.println("\nNew value is " + user_hand_total);
        if (user_hand_total > 21){
          System.out.println("\nOh no! You bust!\n");
          break;
        }
        else if (user_hand_total == 21){
          System.out.println("\nCongrats\nYou win");
          break;
        }
      //System.out.println("You hit 1"); //then go back to drawCard
    }
    else if (n == 2) { //if we stay then dealer logic starts
      System.out.println("Your oppnent's hand is:\n");
      for (int i = 0; i < b.compHand.size(); i++) {
        System.out.println(b.compHand.get(i).getName());
      }
      System.out.println("\nValue is " + comp_hand_total);
      break;
      //System.out.println("you hit 2"); //then game progresses
      }
      else if (comp_hand_total > 17){
        System.out.println("Dealer stays");
    }
    else if (n == 3) {
      System.out.println("Cheers :)"); //program ends completly
      System.exit(0); //created booleans
    }
    else {
      System.out.println("Please enter a valid option:\n"); //enter new input
    }

  } // end of asking user while loop


  //ADD SOME BOOLEANS TO DEAL WITH THIS ISH

if (bust == false) {
  while (comp_hand_total <= 16) { //need to be able to draw more than one hand
  b.compHand.add(b.d.drawCard());
  System.out.println("\nDealer drew a " + b.compHand.get(b.compHand.size()-1).getName());
  comp_hand_total = b.calculateHand(b.compHand);
  System.out.println("\nNew value is " + comp_hand_total);

  if (comp_hand_total == 21) {
    System.out.println("\nDealer wins!");
    break;
  }

  if (comp_hand_total > 21) {
    System.out.println("\nDealer Busts\nYou win!");
    break;
  }
  else if (comp_hand_total > 17){
    System.out.println("\nDealer stays\n");
  }
    }
    //resolving game
  if (user_hand_total <= comp_hand_total) {
    System.out.println("You lose!");
  }
  else if (user_hand_total > comp_hand_total) {
    System.out.println("You win!");
  }
  }


//clear userHand and compHand
b.userHand.clear();
b.compHand.clear();

System.out.println("\nDo you want to play again?\nY/N");
  String george = reader.next();

    if (george.equals("y")) {
      System.out.println("Yeet");
    }
    else if (george.equals("n")) {
      System.out.println("Cheers!");
      break;
    }
  }

  }
} //end bracket of entire thing

//while loop for what happens after (compHand)
//dealer logic is another while loop if over 16 or value > 21 then break loop
//if you choose option 1 then will need to loop again- Scanner will be inside of loop
//indefinite loop- while loop until hit 2 or 3 or bust
//if userHand busts then skip compHand
//two while loops for userHand and compHand- compHand is outside of userHand loop
//then resolve game
