package array;

import java.util.Scanner;

public class PlusMinus {

  static void plusMinus(int[] arr) {
    double c = 0, d = 0, e = 0;
    for (int i : arr) {
      if (i > 0) {
        c++;
      }
      if (i == 0) {
        d++;
      }
      if (i < 0) {
        e++;
      }
    }
    String s = String.valueOf((arr.length));
    System.out.println(c);
    System.out.println(c / Float.parseFloat(s));
    System.out.println(d / Float.parseFloat(s));
    System.out.println(e / Float.parseFloat(s));


  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    plusMinus(arr);

    scanner.close();
  }
}
