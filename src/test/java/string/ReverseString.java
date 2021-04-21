package string;

public class ReverseString {

  public static void main(String[] args) {
    reverse("piyush");
  }

  public static void reverse(String s) {
    char[] chars = s.toCharArray();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = chars.length - 1; i >= 0; i--) {
      stringBuilder.append(chars[i]);
    }
    System.out.println(stringBuilder.toString());
  }

}
