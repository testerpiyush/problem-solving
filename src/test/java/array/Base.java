package array;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class Base {


  @AfterTest
  public static void afterTest(ITestResult result) {

    if (result.getStatus() == 1) {
      System.out.println("pass");
      CustomListeners.markJira("jira", "pass");
    } else {

    }

  }

}
