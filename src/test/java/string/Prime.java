package string;

import java.util.ArrayList;
import java.util.List;

public class Prime {

  public static void main(String[] args) {
    printPrimeNumber(1, 100);
  }

  public static void printPrimeNumber(int from, int to) {

    List<Integer> list = new ArrayList<>();
    for (int i = from; i <= to; i++) {
      int count = 0;
      for (int num = i; num >= 1; num--) {
        if (i % num == 0) {
          count++;
        }
      }
      if (count == 2) {
        list.add(i);
      }
    }

  }
}
