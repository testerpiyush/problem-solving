package array;

import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {

    // TODO Auto-generated method stub

    int[] a = {1, 2, 3, 4, 5};

    int n = 5;

    int j = a.length - 1;

    while (j < n) {

      if (j == 0) {

        break;

      }

      int temp = a[j];

      a[j] = a[j - 1];

      a[j - 1] = temp;

      j--;

      System.out.print(Arrays.toString(a));

      System.out.println();

    }

    System.out.print(Arrays.toString(a));


  }


}
