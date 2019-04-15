import java.util.*;
import java.io.*;

public class HashTest {

  public static void main(String[] args) {

    ArrayList<Integer> code = new ArrayList<Integer>();

    code.add(6);
    code.add(8);
    code.add(3);

    System.out.println("This is the start code: " + code);

    int firstNumber = code.get(0);

    if(firstNumber <= 5) {
      int y = 0;
      y = code.get(1) + code.get(2);
      code.set(0, y);
    }
    if(firstNumber > 5) {
      int u = 0;
      u = code.get(1) * code.get(2);
      code.set(0, u);
    }

    int secondNumber = code.get(1);

    if(secondNumber <= 5) {
      int k = 0;
      k = code.get(2) - code.get(1);
      code.set(1, k);
    }

    if(secondNumber > 5) {
      int j = 0;
      j = code.get(0) - code.get(1);
      code.set(1, j);
    }

    int fourthNumber = code.get(3);

    if(fourthNumber <= 5) {
      int k = 0;
      k = code.get(0) - code.get(1);
      code.set(1, k);
    }

    if(fourthNumber > 5) {
      int j = 0;
      j = code.get(2) - code.get(1);
      code.set(1, j);
    }

    System.out.println("This is the new code: " + code);
  }
}
