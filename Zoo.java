import java.util.*;
import java.io.*;

public class Zoo{
  ArrayList<Animal> aninfo;
  ArrayList<Enclosure> encloinfo;


  public Zoo() {
    aninfo = new ArrayList<Animal>();
    encloinfo = new ArrayList<Enclosure>();
  }

  private static Animal[] getAnimals(){
          Animal[] animals = new Animal[3];

          animals[0] = new Animal("Snail", 0, false);
          animals[1] = new Animal("Banana Slug", 0, false);
          animals[2] = new Animal("Octopus", 8, false);

          return animals;
}

private static Enclosure[] getEnclosure(){
        Enclosure[] enclosures = new Enclosure[3];

        enclosures[0] = new Enclosure("Shell", 1);
        enclosures[1] = new Enclosure("Banana peel", 10);
        enclosures[2] = new Enclosure("Aquarium", 50);

        return enclosures;
}

  public static void main(String[] args) {
    Zoo z = new Zoo();
//need scanner for user input
//while loop for always loop
//hashmap also for putting the stuff in
//maps enclosure names with animals

//HashMap choices = new HashMap<String,<String>();
//choices.put("shell", "");
//Animal a = new Animal();

//a.setName("Snail");
//a.setLegs(0);
//a.setMammal(false);
//System.out.println(z.getAnimals());

for(Animal ani:getAnimals()){ //this is similar to the size function but for an Array
  System.out.println(ani.getName() + ": has " + ani.getLegs() + " legs, mammal? " + ani.getMammal());
        }
for(Enclosure enclo:getEnclosure()){
  System.out.println(enclo.getHabitat() + ": is " + enclo.getSize() + " inches");
        }

}
}
