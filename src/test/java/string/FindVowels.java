package string;

public class FindVowels {

  public static int vowels(String s) {
    int count = 0;

    for (char c : s.toCharArray()) {
      switch (c) {
        case 'a':
          count++;
          break;
        case 'e':
          count++;
          break;
        case 'i':
          count++;
          break;
        case 'o':
          count++;
          break;
        case 'u':
          count++;
          break;
        default:
          break;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int c = vowels("aeiouuuy");
    System.out.println(c);
  }

}
