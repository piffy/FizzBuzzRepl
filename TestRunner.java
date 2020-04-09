import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main() {
    int count=0;
    Result result = JUnitCore.runClasses(TestJunit.class);
    
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
      count++;
    }
    
    System.out.println(result.wasSuccessful() ? "OK" : "Test con errori: "+count);
  }
}