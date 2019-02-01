public class Weasel extends Carnivora {

public String season;
public boolean furChange;

public Weasel(int goodVision, int goodSmell, int goodHearing, boolean Omn, boolean furChange){
 super(goodVision, goodSmell, goodHearing, Omn);
 furChange = furChange;
}

public void setfurChange(boolean fall){
  furChange = fall;
}

public static void main(String[] args) {
  Weasel todd = new Weasel(20, 1, 1,true,true);
  todd.Weasels();
  }
public void Weasels() {
  if (furChange = true) {
    System.out.println("Todd is a liar");
  }
  else {
    System.out.println("Todd is a coward");
  }
}
}
