package string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CreateAnagramNumberDelete {

  // Complete the makeAnagram function below.
  static int makeAnagram(String a, String b) {
    int count = 0;
    char[] chars = a.toCharArray();
    char[] chars1 = b.toCharArray();

    Map<Character, Integer> map = new HashMap<Character, Integer>();
    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    for (int i = 0; i < chars.length; i++) {
      if (!map.containsKey(chars[i])) {
        map.put(chars[i], 1);
      } else {
        map.put(chars[i], (map.get(chars[i]) + 1));
      }
    }
    for (int j = 0; j < chars1.length; j++) {
      if (!map1.containsKey(chars1[j])) {
        map1.put(chars1[j], 1);
      } else {
        map1.put(chars1[j], (map1.get(chars1[j]) + 1));
      }
    }

    for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
      if (!entry.getValue().equals(map.get(entry.getKey()))) {
        if (map.containsKey(entry.getKey())) {
          count += Math.abs(entry.getValue() - map.get(entry.getKey()));

        } else {
          count += entry.getValue();
        }
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (!entry.getValue().equals(map1.get(entry.getKey()))) {
        if (!map1.containsKey(entry.getKey())) {
          count += entry.getValue();
        }
      }
    }
    System.out.println(count);
    return count;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String a = "abc";

    String b = "dec";

    int res = makeAnagram(a, b);

    scanner.close();
  }
}
