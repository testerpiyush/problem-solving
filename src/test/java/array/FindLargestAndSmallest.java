package array;

public class FindLargestAndSmallest {

  public static void largestAndSmallest(int[] numbers) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int number : numbers) {
      if (number > largest) {
        largest = number;
      } else if (number < smallest) {
        smallest = number;
      }
    }
    System.out.println(largest + "largest");
    System.out.println(smallest + "smallest");
  }

  public static void main(String[] args) {
    int[] a = {12, 11, 2, 3, 19, 0, 23};
    largestAndSmallest(a);
  }


}



