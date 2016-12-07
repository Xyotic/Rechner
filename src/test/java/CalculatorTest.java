import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by Sebastian on 03.12.2016.
 * A test class for the calculator class
 */
public class CalculatorTest {
    public static void main(String[] args) {

        String simulatedUserInput =
                  "6" + System.getProperty("line.separator")
                + "/" + System.getProperty("line.separator")
                + "9" + System.getProperty("line.separator")
                + "Y" + System.getProperty("line.separator")
                + "11" + System.getProperty("line.separator")
                + "*"  + System.getProperty("line.separator")
                + "1.5"+ System.getProperty("line.separator")
                + "N";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        Result result = JUnitCore.runClasses(Calculator.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}