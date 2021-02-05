import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\David\\Desktop\\Cucumber\\src\\test\\resources",
        plugin = "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter")
final class JUnitRunner {

    /**
     * Default constructor.
     */
    private JUnitRunner() {

    }

    /**
     * Will be executed before the feature files.
     */
    @BeforeClass
    public static void setUp() {
        System.out.println("Starting feature test run");
    }

    /**
     * Will be executed after the feature files.
     */
    @AfterClass
    public static void tearDown() {
        System.out.println("Finishing feature test run");
    }
}