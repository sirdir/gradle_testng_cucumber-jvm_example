package space.sirdir;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = {"src/test/java/space/sirdir/features/"}
        , glue = {"space.sirdir.steps"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}