package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestClass {

  public static void main(String[] args) {
    try {
      badMethod();
      System.out.println("A");
    } catch (Exception e) {
      System.out.println("B");
      Map<Integer, Integer> map = new HashMap<>();
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 2) {
          map.remove(entry);
        }
      }
    } finally {
      System.out.println("c");
    }
    System.out.println("D");
  }


  public static void badMethod() {
    throw new Error();
  }
}
