package array;

public class PrintAllLeaders {

  public static void main(String[] args) {
    int[] a = {10, 12, 9, 0, 23, 15, 16, 8};
    findLeaders(a);
  }

  public static void findLeaders(int[] a) {
    int x = a.length;
    for (int i = 0; i < x; i++) {
      int j;
      for (j = i + 1; j < x; j++) {
        if (a[i] <= a[j]) {
          break;
        }
      }
      if (j == x) {
        System.out.println(a[i]);
      }
    }
  }

}
