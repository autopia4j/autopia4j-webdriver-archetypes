#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.cuketests;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {
				"src/test/resources/features"
				},
		glue = {
				"com.autopia4j.framework.webdriver.impl.cucumber",
				"${package}.cukeglue"
				},
		monochrome = true,	// "true" = better formatting of console output
		plugin = {
				"pretty",	// prints pretty report on command line
				"pretty:target/cuke-reports/pretty.txt",
				"html:target/cuke-reports/cucumber-htmlreport",
				"junit:target/cuke-reports/cucumber-junitreport.xml",
				"usage:target/cuke-reports/usage.json"
				},
		strict = true
		)
public class CukesTestNgRunner extends AbstractTestNGCucumberTests {

	@Test
	public void dummyTest() {
		
	}
}