public class Animal {

  String name;
  int legs;
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

  //public Animal() {
  //  name = "";
  //  legs = 0;
  //  mammal = true;
  //}

  public Animal(String name, int legs, Boolean mammal) {
    this.name = name;
    this.legs = legs;
    this.mammal = mammal;
  }

}
