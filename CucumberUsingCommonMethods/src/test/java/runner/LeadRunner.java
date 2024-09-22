package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.CommonExecution;

@CucumberOptions(features = "src/test/java/feature", glue = "stepDefinition", 
publish = true, monochrome = true, tags = "@Demo")
public class LeadRunner extends CommonExecution{

}
