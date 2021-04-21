package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WendyBob {

  public static void main(String[] args) {
    String s = "wbw";
    gameWinner(s);

  }


  public static String gameWinner(String colors) {
    // Write your code here
    System.out.println(colors);
    char[] sr = colors.toCharArray();

    int res = 0;

    for (int i = 0; i < sr.length; i++) {
      res ^= sr[i];
    }

    // case when Alice is winner
    if (res == 0 || sr.length % 2 == 0) {
      return "bob";
    }

    // when Bob is winner
    else {
      return "wendy";
    }
  }

}
