import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {

   Log log = new Log();


    @Override
    public void testSuccessful(ExtensionContext context) {
        String testname = context.getDisplayName();
        log.info(testname + "Passed");



    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testname = context.getDisplayName();
        String testfailCause = cause.getMessage();
        log.warn(testname + "Failed with cause: " + testfailCause);
    }
}
