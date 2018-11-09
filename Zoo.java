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

for(Animal ani:getAnimals()){
  System.out.println(ani.getName());
        }
//aninfo.add(a);
//aninfo.add(new Animal("Banana Slug", 0, false));
//aninfo.add(new Animal("Octopus", 8, false));
//System.out.println(aninfo(0));
//System.out.println(aninfo(1));
//System.out.println(aninfo(2));

}
}
