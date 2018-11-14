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

    Enclosure e1= new Enclosure("Aquarium", 100); //creates the enclosure options
    Enclosure e2 = new Enclosure("Forest",300);
    Enclosure e3 = new Enclosure("Plains", 120);
    Enclosure e4 = new Enclosure("Jungle", 200);

    ArrayList<String> elist = new ArrayList<String>(); //create an arraylist to include all enclosure choices
    elist.add(e1.getHabitat());
    elist.add(e2.getHabitat());
    elist.add(e3.getHabitat());
    elist.add(e4.getHabitat());
    elist.add("Quit");


    Animal Snail = new Animal("Snail", 0, false, "cucumbers"); //made Animal objects for each animal
    Animal Slug = new Animal("Banana Slug", 0, false, "mushrooms");
    Animal Octopus = new Animal("Octopus", 8, false, "fish");

    Animal BlackBear = new Animal("Black Bear", 4, true, "honey");
    Animal Grizzly = new Animal("Grizzly Bear", 4, true, "deer");

    Animal Badger = new Animal("Badger", 4, true, "earthworms");
    Animal Coyote = new Animal("Coyote", 4, true, "Rabbits");
    Animal Rabbit = new Animal("Rabbit", 4, true, "grass");

    Animal Chimp = new Animal("Chimpanzee", 4, true, "fruit and your face");
    Animal Leopard = new Animal("Leopards", 4, true, "Gazelle");

    Animal[] invertebrae = {Snail, Slug, Octopus}; //put each animal object into an array
    Animal[] vertebrae = {BlackBear, Grizzly};
    Animal[] shmer = {Badger, Coyote, Rabbit};
    Animal[] variable = {Chimp, Leopard};

HashMap<String, Animal[]> choices = new HashMap<String, Animal[]>();

choices.put(e1.getHabitat(), invertebrae); //make a key and value between the animal array and the enclosure
choices.put(e2.getHabitat(), vertebrae);
choices.put(e3.getHabitat(), shmer);
choices.put(e4.getHabitat(), variable);

while (true){

System.out.println("Pick a habitat:");
int g = 0;
for(int i = 0; i < elist.size(); i++){ //loops through an arraylist to print each enclosure
  g = i+1;
  System.out.println(g + elist.get(i));
}

Scanner bleh = new Scanner(System.in);

int n = 0;

n = bleh.nextInt();

if (n == 1) { //if statements for each choice and the choice is dealing with the habitats
  System.out.println("The enclosure is: " + e1.getSize() + " square feet");
  System.out.println("Animals in this enclosure:");
  z.printAnimals(choices.get("Aquarium"));


/*  for(int i=0; i < S.size(); i++) {
    System.out.println(S.get(i));
  }
*/

  System.out.println("\nSome info about them:\n" + Snail.getName() + " has " + Snail.getLegs() + " legs");
  System.out.println(Slug.getName() + " has " + Slug.getLegs() + " legs");
  System.out.println(Octopus.getName() + " has " + Octopus.getLegs() + " legs\n");

  System.out.println(Snail.getName() + " eats: " + Snail.getDiet());
  System.out.println(Slug.getName() + " eats: " + Slug.getDiet());
  System.out.println(Octopus.getName() + " eats: " + Octopus.getDiet());

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(Snail.getMammal());
  System.out.println(Slug.getMammal());
  System.out.println(Octopus.getMammal());
}

if (n == 2) {
  System.out.println("The enclosure is: " + e2.getSize() + " square feet");
  System.out.println("Animals in this enclosure:");
  z.printAnimals(choices.get("Forest"));

  System.out.println("\nSome info about them:\n" + BlackBear.getName() + " has " + BlackBear.getLegs() + " legs");
  System.out.println(Grizzly.getName() + " has " + Grizzly.getLegs() + " legs\n");

  System.out.println(BlackBear.getName() + " eats: " + BlackBear.getDiet());
  System.out.println(Grizzly.getName() + " eats: " + Grizzly.getDiet());

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(BlackBear.getMammal());
  System.out.println(Grizzly.getMammal());
}

if (n == 3) {
  System.out.println("The enclosure is: " + e3.getSize() + " square feet");
  System.out.println("Animals in this enclosure:");
  z.printAnimals(choices.get("Plains"));

  System.out.println("\nSome info about them:\n" + Badger.getName() + " has " + Badger.getLegs() + " legs");
  System.out.println(Coyote.getName() + " has " + Coyote.getLegs() + " legs");
  System.out.println(Rabbit.getName() + " has " + Rabbit.getLegs() + " legs\n");

  System.out.println(Badger.getName() + " eats: " + Badger.getDiet());
  System.out.println(Coyote.getName() + " eats: " + Coyote.getDiet());
  System.out.println(Rabbit.getName() + " eats: " + Rabbit.getDiet());

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(Badger.getMammal());
  System.out.println(Coyote.getMammal());
  System.out.println(Rabbit.getMammal());
}

if (n == 4) {
  System.out.println("The enclosure is: " + e4.getSize() + " square feet");
  System.out.println("Animals in this enclosure:");
  z.printAnimals(choices.get("Jungle"));

  System.out.println("\nSome info about them:\n" + Chimp.getName() + " has " + Chimp.getLegs() + " legs");
  System.out.println(Leopard.getName() + " has " + Leopard.getLegs() + " legs\n");

  System.out.println(Chimp.getName() + " eats: " + Chimp.getDiet());
  System.out.println(Leopard.getName() + " eats: " + Leopard.getDiet());

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(Chimp.getMammal());
  System.out.println(Leopard.getMammal());
}

if(n==5) {
  break;
}

else {
  System.out.println("Sorry we didn't understand that.");
}

}
}
}
