import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"src/test/java/com/app/feature/"},
					glue= {"com.app.stepdef"},
					plugin= {"pretty","html:target/cucumber-htmlreport",
							"json:target/cucumber-report.json"
					}
		
			)
public class FacebooFeatureRun {

}
