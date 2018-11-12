import java.util.*;
import java.io.*;

public class Zoo1{


  public void printAnimals(Animal[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i].getName());
    }
  }

  public Zoo1() {

  }

  public static void main(String[] args) {
    Zoo1 z = new Zoo1();

    Enclosure e1= new Enclosure("Aquarium", 50);
    Enclosure e2 = new Enclosure("Forest",200);

    Animal Snail = new Animal("Snail", 0, false);
    Animal Slug = new Animal("Banana Slug", 0, false);
    Animal Octopus = new Animal("Octopus", 8, false);

    Animal BlackBear = new Animal("Black Bear", 4, true);
    Animal Grizzly = new Animal("Grizzly Bear", 4, true);

    Animal[] invertebrae = {Snail, Slug, Octopus};
    Animal[] vertebrae = {BlackBear, Grizzly};

HashMap<String, Animal[]> choices = new HashMap<String, Animal[]>();

choices.put(e1.getHabitat(), invertebrae);
choices.put(e2.getHabitat(), vertebrae);

while (true){

System.out.println("Pick a habitat:\n1.Aquarium\n2.Forest\n3.Quit");

Scanner bleh = new Scanner(System.in);

int n = 0;

n = bleh.nextInt();

if (n == 1) {
  System.out.println("There are");
  z.printAnimals(choices.get("Aquarium"));
  System.out.println("in this enclosure\n");

  System.out.println("Some info about them:\n" + Snail.getName() + " has " + Snail.getLegs() + " legs");
  System.out.println(Slug.getName() + " has " + Slug.getLegs() + " legs");
  System.out.println(Octopus.getName() + " has " + Octopus.getLegs() + " legs\n");

  System.out.println("Are they mammals?\n--->");
  System.out.println(Snail.getMammal());
  System.out.println(Slug.getMammal());
  System.out.println(Octopus.getMammal());
}

if (n == 2) {
  System.out.println("There are");
  z.printAnimals(choices.get("Forest"));
  System.out.println("in this enclosure\n");
  System.out.println("Some info about them:\n" + BlackBear.getName() + " has " + BlackBear.getLegs() + " legs");
  System.out.println(Grizzly.getName() + " has " + Grizzly.getLegs() + " legs\n");

  System.out.println("Are they mammals?\n--->");
  System.out.println(BlackBear.getMammal());
  System.out.println(Grizzly.getMammal());
}

if(n==3) {
  break;
}

}
}
}
