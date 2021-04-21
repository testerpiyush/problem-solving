package string;

public class AlternativeCharDeletion {

  private int alternatingCharacters(String s) {

    int count = 0;
    for (int j = 0; j < s.length() - 1; j++) {
      if (s.charAt(j) == s.charAt(j + 1)) {
        count++;
      }
    }
    System.out.println(count);
    return count;
  }


}
