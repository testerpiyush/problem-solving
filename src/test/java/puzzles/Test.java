package puzzles;

public class Test {


  public static void main(String[] args) {
    int a = 012;

    if (performDivision(a)) {
      System.out.println("divisible");
    } else {
      System.out.println("Not divisible");
    }


  }


  public static boolean findDivisbility(int n, int digit) {

    return (digit != 0 && n % digit == 0);
  }

  public static boolean performDivision(int n) {

    int temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      if (!findDivisbility(n, digit)) {
        return false;
      }
      temp /= 10;
    }
    return true;
  }


}
















