package array;

public class SecondLargest {

  public static void main(String[] args) {
    int[] ar = {1, 7, 4, 0, 11, 9, 22, 99, 77};
    int a, b;
    if (ar[0] > ar[1]) {
      a = ar[1];
      b = ar[0];
    } else {
      a = ar[0];
      b = ar[1];
    }
    for (int i = 2; i < ar.length; i++) {
      if (ar[i] > a) {
        b = a;
        a = ar[i];
      } else if (ar[i] < a && ar[i] > b) {
        b = ar[i];
      }
    }
    System.out.println("second largest " + b);
  }

}
