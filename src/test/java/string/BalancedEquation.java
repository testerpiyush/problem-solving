package string;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedEquation {

  public static void main(String[] args) {
    String s = "[)";
    if (findBalance(s)) {
      System.out.println("balanced");
    } else {
      System.out.println("Not balanced");
    }
  }

  private static boolean findBalance(String s) {

    Deque<Character> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char x = s.charAt(i);
      if (x == '(' || x == '{' || x == '[') {
        deque.push(x);
        continue;
      }

      if (deque.isEmpty()) {
        return false;
      }
      char c;

      switch (x) {
        case ')':
          c = deque.pop();
          if (c == '{' || c == '[') {
            return false;
          }
          break;

        case '}':
          c = deque.pop();
          if (c == '(' || c == '[') {
            return false;
          }
          break;

        case ']':
          c = deque.pop();
          if (c == '(' || c == '{') {
            return false;
          }
          break;


      }

    }

    return (deque.isEmpty());

  }
}
