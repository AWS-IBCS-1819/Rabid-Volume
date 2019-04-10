import java.util.*;
import java.io.*;

public class HashTest {



  public HashTest() {

  }

  public static void main(String[] args) {
    System.out.println("Input the code");
    Scanner reader = new Scanner(System.in);
    int n = 0;
    n = reader.nextInt();
    System.out.println("The code is:"+n);
    String code = Integer.toString(n);
  }
}
