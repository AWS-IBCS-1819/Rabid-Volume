public class Carnivora {

  public int vision;
  public int smell;
  public int hearing;
  public boolean omniverous;

  public Carnivora(int goodVision, int goodSmell, int goodHearing, boolean Omn){
    vision = goodVision;
    smell = goodSmell;
    hearing = goodHearing;
    omniverous = Omn;
  }

  public void setVision(int newValue) {
    vision = newValue;
  }

  public void setSmell(int newValue) {
    smell = newValue;
  }

  public void setHearing(int newValue){
    hearing = newValue;
  }

  public void setOmniverous(boolean j) {
    omniverous = j;
  }

}
