package array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int c = 0;
    int d = 0;
    for (List<Integer> ss : arr) {
      for (int j = 0; j < ss.size(); ) {
        c = ss.get(j) + c;
        j = j + 1;
      }
    }

    int i = arr.size() - 1;
    while (i <= 0) {
      List<Integer> ss = arr.get(i);
      for (Integer s : ss) {

        c = s + c;
        System.out.println("xx" + c);

      }
      i--;
    }
    return c;
  }
}


