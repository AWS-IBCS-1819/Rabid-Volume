import java.util.*;
import java.io.*;

public class Zoo2{


  public void printAnimals(Animal[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i].getName());
    }
  }

  public Zoo2() {

  }

  public static void main(String[] args) {
    Zoo2 z = new Zoo2();

    Enclosure e1= new Enclosure("Aquarium", 100); //creates the enclosure options
    Enclosure e2 = new Enclosure("Forest",300);

    ArrayList<String> elist = new ArrayList<String>(); //create an arraylist to include all enclosure choices
    elist.add(e1.getHabitat());
    elist.add(e2.getHabitat());
    elist.add("Quit");


    Animal Snail = new Animal("Snail", 0, false, "cucumbers"); //made Animal objects for each animal
    Animal Slug = new Animal("Banana Slug", 0, false, "mushrooms");
    Animal Octopus = new Animal("Octopus", 8, false, "fish");

    ArrayList<Integer> invert = new ArrayList<Integer>();
    invert.add(Snail.getLegs());
    invert.add(Slug.getLegs());
    invert.add(Octopus.getLegs());

    ArrayList<String> in = new ArrayList<String>();
    in.add(Snail.getDiet());
    in.add(Slug.getDiet());
    in.add(Octopus.getDiet());

    ArrayList<Boolean> jake = new ArrayList<Boolean>();
    jake.add(Snail.getMammal());
    jake.add(Slug.getMammal());
    jake.add(Octopus.getMammal());

    Animal BlackBear = new Animal("Black Bear", 4, true, "honey");
    Animal Grizzly = new Animal("Grizzly Bear", 4, true, "deer");

    ArrayList<Integer> vert = new ArrayList<Integer>();
    vert.add(BlackBear.getLegs());
    vert.add(Grizzly.getLegs());

    ArrayList<String> d = new ArrayList<String>();
    d.add(BlackBear.getDiet());
    d.add(Grizzly.getDiet());

    ArrayList<Boolean> ake = new ArrayList<Boolean>();
    ake.add(BlackBear.getMammal());
    ake.add(Grizzly.getMammal());

    Animal[] invertebrae = {Snail, Slug, Octopus}; //put each animal object into an array
    Animal[] vertebrae = {BlackBear, Grizzly};

HashMap<String, Animal[]> choices = new HashMap<String, Animal[]>();

choices.put(e1.getHabitat(), invertebrae); //make a key and value between the animal array and the enclosure
choices.put(e2.getHabitat(), vertebrae);

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
  System.out.println("\nSome more info about them:");

  System.out.println("These animals have: " + invert + " legs");

  System.out.println("These animals eat: " + in);

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(jake + "\n");
}

if (n == 2) {
  System.out.println("The enclosure is: " + e2.getSize() + " square feet");
  System.out.println("Animals in this enclosure:");
  z.printAnimals(choices.get("Forest"));
  System.out.println("\nSome more info about them");

  System.out.println("These animals have: " + vert + " legs");

  System.out.println("These animals eat: " + d);

  System.out.println("\nAre they mammals?\n--->");
  System.out.println(ake + "\n");
}

if(n==3) {
  break;
}

}
}
}
