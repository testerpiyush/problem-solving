package array;

import java.util.Collections;
import java.util.HashMap;

public class ConsucativeSequence {


  static int LongIncrConseqSubseq(int arr[]) {
    // create hashmap to save latest consequent
    // number as "key" and its length as "value"
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = arr.length;
    // put first element as "key" and its length as "value"
    map.put(arr[0], 1);
    for (int i = 1; i < n; i++) {

      // check if last consequent of arr[i] exist or not
      if (map.containsKey(arr[i] - 1)) {

        // put the updated consequent number
        // and increment its value(length)
        map.put(arr[i], map.get(arr[i] - 1) + 1);

        // remove the last consequent number
        map.remove(arr[i] - 1);
      }

      // if their is no last consequent of
      // arr[i] then put arr[i]
      else {
        map.put(arr[i], 1);
      }
    }
    return Collections.max(map.values());
  }

  // driver code
  public static void main(String args[]) {
    int[] arr = {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};

    System.out.println(LongIncrConseqSubseq(arr));
  }

}
