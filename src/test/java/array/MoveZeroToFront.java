package array;

public class MoveZeroToFront {


  public static void main(String[] args) {
    //int[] arr = {1,4,5,0,3,0,9,8};
    int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1};
    int counter = arr.length - 1;
    for (int i = arr.length - 1; i >= 0; i--) {

      if (arr[i] != 0) {
        arr[counter] = arr[i];
        counter--;
      }

    }
    while (counter >= 0) {
      arr[counter] = 0;
      counter--;
    }
    for (int j = 0; j < arr.length; j++) {
      System.out.println(arr[j]);
    }
  }


}
