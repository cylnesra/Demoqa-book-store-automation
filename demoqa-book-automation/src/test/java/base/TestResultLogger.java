package base;

import org.example.logger.Log;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {
    //The TestWatcher API was used to monitor executed tests and for logging operations.
    //The TestWatcher API is an interface. Once we implemented it,
    //we overridden its methods and populated them with the actions we needed to perform.
    Log log = new Log();
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName + "PASSED");

    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage();
        log.error(testName + "FAILED with cause : " + testFailCause);
    }
}
