import java.util.*;
import java.io.*;

public class HashTest {

  public static void main(String[] args) {

    ArrayList<Integer> code = new ArrayList<Integer>();

    code.add(1);
    code.add(0);
    code.add(0);
    code.add(0);
    code.add(0);

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

    int thirdNumber = code.get(2);

    if(thirdNumber <= 5) {
      int k = 0;
      k = code.get(2) + 2;
      code.set(2, k);
    }

    if(thirdNumber > 5) {
      int j = 0;
      j = code.get(3) - code.get(1);
      code.set(2, j);
    }

    int fourthNumber = code.get(3);

    if(fourthNumber <= 5) {
      int k = 0;
      k = code.get(0) - code.get(1);
      code.set(3, k);
    }

    if(fourthNumber > 5) {
      int j = 0;
      j = code.get(2) - code.get(1);
      code.set(3, j);
    }

    int fifthNumber = code.get(4);

    if(fourthNumber <= 5) {
      int k = 0;
      k = code.get(4) - code.get(0);
      code.set(4, k);
    }

    if(fourthNumber > 5) {
      int j = 0;
      j = code.get(2) - code.get(4);
      code.set(4, j);
    }

    StringBuilder sb = new StringBuilder();
      for (int i = code.size() - 1; i >= 0; i--) {
        int num = code.get(i);
        sb.append(num);
      }
      String result = sb.toString();

    System.out.println("This is the new code: " + result);
  }
}
