package runner;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/feature/loging.feature"}, glue= {"steps"}, tags="@Datatable",plugin={"html:target/cucumber-report/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
@Test
public class runcucumber extends AbstractTestNGCucumberTests{
	
}
