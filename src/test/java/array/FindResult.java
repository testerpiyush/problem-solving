package array;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindResult {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    List<Integer> finalList = new ArrayList<Integer>();
    int c1 = 0, c2 = 0;
    map.put("c2", c2);
    map.put("c1", c1);
    for (int i = 0; i < a.size(); i++) {

      if (a.get(i) > b.get(i)) {
        c1 = c1 + 1;
        map.put("c1", c1);

      } else if (a.get(i).equals(b.get(i))) {
        c1 = 0;
        c2 = 0;
      } else {
        c2 = c2 + 1;
        map.put("c2", c2);
      }
    }

    finalList.add(map.get("c1"));
    finalList.add(map.get("c2"));
    System.out.println(finalList.toString());
    return finalList;
  }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>();
    a.add(6);
    a.add(8);
    a.add(12);
    List<Integer> b = new ArrayList<Integer>();
    b.add(7);
    b.add(9);
    b.add(15);
    compareTriplets(a, b);
  }


}
