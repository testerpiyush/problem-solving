package string;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test {


  public static void main(String[] args) {
    String s = "Piyush Sharma";
    findDuplicates(s);
  }

  public static void findDuplicates(String s1) {

    s1 = s1.replaceAll(" ", "");
    char[] chars = s1.toCharArray();

    HashMap<Character, Integer> map = new HashMap();

    for (int i = 0; i < chars.length; i++) {

      if (map.containsKey(chars[i])) {
        map.put(chars[i], (map.get(chars[i]) + 1));
      } else {
        map.put(chars[i], 1);
      }

    }

    for (Entry<Character, Integer> c : map.entrySet()) {
      if (c.getValue() > 1) {
        System.out.println("Duplicate char is :" + c.getKey());
        System.out.println("Occurance is : " + c.getValue());
      }
    }

  }


}
