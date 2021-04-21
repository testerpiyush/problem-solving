package array;

public class ReverseArrayWithoutAddintionalArray {

  public static void main(String[] args) {

    int[] arr = {2, 5, 1, 10, 9};
    int temp;
    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    for (int a : arr) {
      System.out.println(a);
    }
  }
}
