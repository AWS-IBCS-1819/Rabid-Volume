import java.util.*;
import java.io.*;

public class HashTest {

  public static void main(String[] args) {

    ArrayList<Integer> code = new ArrayList<Integer>();

    code.add(6);
    code.add(8);
    code.add(3);

    System.out.println("This is the start code: " + code);

    int z = code.get(0);

    if(z <= 5) {
      int y = 0;
      y = code.get(1) + code.get(2);
      code.set(0, y);
    }
    if(z > 5) {
      int u = 0;
      u = code.get(1) * code.get(2);
      code.set(0, u);
    }

    System.out.println("This is the new code: " + code);
  }
}
