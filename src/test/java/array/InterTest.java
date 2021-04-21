package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterTest {


  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("first");
    list.add("second");
    list.add("third");

    System.out.println(play(list, 0));
    System.out.println(play(list, 100));
    System.out.println(play(list, list.size() + 1));
    System.out.println(play(list, list.size()));
    System.out.println(play(list, -1));

    list.removeAll(list);
    play(list, 1);
  }

  public static String play(List<String> playlist, int n) {
    String song;

    if (playlist.size() > 0) {
      if (n > playlist.size()) {
        n = n % playlist.size();

      } else if (n <= 0) {
        System.out.println("Please select the valid songs form the list");
        System.exit(1);
      }

      song = playlist.get(n - 1);

      return song;

    } else {
      return "Playlist is empty";
    }
  }

}




