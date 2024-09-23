package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.CommonExecution;

@CucumberOptions(features = "src/test/java/feature/editLead.feature", glue = "stepDefinition", 
publish = true, monochrome = true)
public class LeadRunner extends CommonExecution{

}
