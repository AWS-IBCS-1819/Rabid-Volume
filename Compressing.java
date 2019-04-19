//Compressing.java by Mr. Considine

import java.io.*;
import java.util.*;


public class Compressing {

public static void main(String[] args) {

  System.out.println("Welcome to the TextCompressor5000!");
  System.out.println("You are compressing \"test1.txt\"!\n\n ====================== \n");

  StringBuilder sb = new StringBuilder();

  try {
    File file = new File("test1.txt");
    Scanner fr = new Scanner(file);

    while (fr.hasNext()){
      String temp = fr.next();
      if (temp == null) {
        break;
      }
      else {
        sb.append(temp);
        sb.append("_");
      }
    }

    System.out.println("your file:\n" + sb);
  }
  catch (FileNotFoundException e) {
    e.printStackTrace();
  }

  HashMap<String, Integer> comps = new HashMap<String, Integer>();
  comps.put("tition", 1);

  for(int i = 0; i < sb.length(); i++) {
    
  }

  try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("testOutput.txt"));
    writer.write(sb.toString());
    writer.close();
  }
  catch (IOException e) {
    e.printStackTrace();
  }
}


}
