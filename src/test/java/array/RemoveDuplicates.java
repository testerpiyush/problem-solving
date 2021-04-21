package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int arr[] = {1, 2, 1, 2, 3, 4, 5};
    int noOfUniqueElement = arr.length;
    Set<Integer> set = new HashSet<Integer>();

    for (int a : arr) {
      if (set.contains(a)) {
        set.add(a);
      }
    }

  }

}
