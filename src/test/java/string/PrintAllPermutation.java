package string;

public class PrintAllPermutation {

  /*public static void main(String[] args) {
   String ni = checkPrem("","abc");
    System.out.println(ni);
  }

  public static String checkPrem(String prem,String s){
   String np = null;
    if(s==null){
      System.out.println("string is empty");
    }


    else {
      for (int i = 0; i < s.length(); i++) {
       np =   checkPrem(prem + s.charAt(i), s.substring(0, i) + s.substring(i + 1, s.length()));
      }
    }
return np;
  }*/

  static void printPermutn(String str, String ans) {

    // If string is empty
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }

    for (int i = 0; i < str.length(); i++) {

      // ith character of str
      char ch = str.charAt(i);

      // Rest of the string after excluding
      // the ith character
      String ros = str.substring(0, i) +
          str.substring(i + 1);

      // Recurvise call
      printPermutn(ros, ans + ch);
    }
  }

  // Driver code
  public static void main(String[] args) {
    String s = "abb";
    printPermutn(s, "");
  }

}
