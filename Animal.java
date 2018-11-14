public class Animal {

  String name;
  int legs;
  Boolean mammal;
  String diet;

  public void setName(String n) {
    name = n;
  }

  public void setLegs(int v) {
    legs = v;
  }

  public void setMammal(Boolean m) {
    mammal = m;
  }

  public void setDiet(String s) {
    diet = s;
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

  public String getDiet(){
    return diet;
  }

  public Animal(String name, int legs, Boolean mammal, String diet) {
    this.name = name;
    this.legs = legs;
    this.mammal = mammal;
    this.diet = diet;
  }

}
