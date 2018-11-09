import java.util.*;
import java.io.*;

public class Zoo{
  ArrayList<Animal> aninfo;
  ArrayList<Enclosure> encloinfo;


  public Zoo() {
    aninfo = new ArrayList<Animal>();
    encloinfo = new ArrayList<Enclosure>();
  }

/*  private static Animal[] getAnimals(){
          Animal[] animals = new Animal[3];

          animals[0] = new Animal("Snail", 0, false);
          animals[1] = new Animal("Banana Slug", 0, false);
          animals[2] = new Animal("Octopus", 8, false);

          aninfo = Animal[];
          return aninfo;
}

private static Enclosure[] getEnclosure(){
        Enclosure[] enclosures = new Enclosure[3];

        enclosures[0] = new Enclosure("Shell", 1);
        enclosures[1] = new Enclosure("Banana peel", 10);
        enclosures[2] = new Enclosure("Aquarium", 50);

        return enclosures;
} */

  public static void main(String[] args) {
    Zoo z = new Zoo();

    Animal Snail = new Animal("Snail", 0, false);
    Enclosure Shell = new Enclosure("Shell", 1);
    Animal Slug = new Animal("Banana Slug", 0, false);
    Enclosure Peel = new Enclosure("Banana Peel", 10);
    Animal Octopus = new Animal("Octopus", 8, false);
    Enclosure Aqua = new Enclosure("Aquarium", 50);
  //  z.aninfo = getAnimals(3);

//need scanner for user input
//while loop for always loop
//hashmap also for putting the stuff in
//maps enclosure names with animals

HashMap<Integer, String> choices = new HashMap<Integer, String>();
choices.put(1, Shell.getHabitat());
choices.put(2, Peel.getHabitat());
choices.put(3, Aqua.getHabitat());
choices.put(4, "quit");
//choices.put("blah", z.aninfo);
while (true){
System.out.println(choices);//CHANGE THIS to only output the key and make it a number
System.out.println("Pick a habitat: ");
Scanner bleh = new Scanner(System.in);
int n = 0;
n = bleh.nextInt();


if(n == 1){
  System.out.println("It's a " + Snail.getName()+ "\nSome information about "+ Snail.getName()+ "\nHas " + Snail.getLegs()+ " legs\n" + "Mammal? -->" +Snail.getMammal());
}
if(n ==2){
  System.out.println("It's a " + Slug.getName()+ "\nSome information about "+ Slug.getName()+ "\nHas " + Slug.getLegs()+ " legs\n" + "Mammal? -->" +Slug.getMammal());
}
if(n == 3){
  System.out.print("It's a " + Octopus.getName()+ "\nSome information about "+ Octopus.getName()+ "\nHas " + Octopus.getLegs()+ " legs\n" + "Mammal? -->" +Octopus.getMammal());
}
else if (n ==4) {
  break;
}
}
//for(Animal ani:getAnimals()){ //this is similar to the size function but for an Array
//  System.out.println(ani.getName() + ": has " + ani.getLegs() + " legs, mammal? " + ani.getMammal());
//        }
//for(Enclosure enclo:getEnclosure()){
//  System.out.println(enclo.getHabitat() + ": is " + enclo.getSize() + " inches");
//        }

}
}
