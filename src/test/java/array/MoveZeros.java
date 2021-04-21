package array;

public class MoveZeros {

  public static void main(String[] args) {
    int[] arr = {0, 1, 1, 1, 0, 0, 1, 1, 0};
    move(arr);
  }

  private static void move(int[] arr) {
    int counter = arr.length - 1;
    for (int i = arr.length - 1; i > 0; i--) {

      if (arr[i] != 0) {
        arr[counter] = arr[i];
        counter--;
      }

    }
    while (counter >= 0) {
      arr[counter] = 0;
      counter--;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
