//due sometime
import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<card> userHand;
  ArrayList<card> compHand;

  public Blackjack() {
    d = new Deck();
    userHand = new ArrayList<card>();
    compHand = new ArrayList<card>();

  }

  public Integer calculateHand(ArrayList<card> h) {

    return null;

  }

  public static void main(String[] args) {

    Blackjack b= new Blackjack();

    for (int i = 0; i < 10; i++) {
      Card c = b.d.drawCard();
      userHand.add(c);
    }

    for (int i = 0; i < userHand.size(); i++) {
      System.out.println(userHand.get(i).getName());
    }

  }
}
