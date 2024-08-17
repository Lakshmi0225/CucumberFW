package RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\CucumberFW\\src\\test\\resources\\Featurefiles\\Googlepage.feature",glue={"stepdef"})
public class GoogleRunner {

}
