public class Enclosure {

  int size;
  String habitat;

  public void setHabitat(String h) {
    habitat = h;
  }

  public void setSize(int s) {
    size = s;
  }

  public String getHabitat() {
    return habitat;
  }

  public Integer getSize() {
    return size;
  }

  public Enclosure() {
    habitat = "";
    size = 0;
  }

}
