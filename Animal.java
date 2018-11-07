public class Animal {

  int legs;
  String name;
  Boolean mammal;

  public void setName(String n) {
    name = n;
  }

  public void setLegs(int v) {
    legs = v;
  }

  public void setMammal(Boolean m) {
    mammal = m;
  }

  public String getName() {
    return name;
  }

  public Integer getLegs() {
    return legs;
  }

  public Boolean getMammal() {
    return mammal;
  }

  public Animal() {
    name = "";
    legs = 0;
    mammal = true;
  }

}
