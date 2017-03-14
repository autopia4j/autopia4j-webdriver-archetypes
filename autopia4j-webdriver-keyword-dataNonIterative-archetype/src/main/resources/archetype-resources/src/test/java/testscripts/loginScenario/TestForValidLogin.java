#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts.loginScenario;

import org.testng.annotations.Test;

import com.autopia4j.framework.webdriver.core.WebDriverTestParameters;
import com.autopia4j.framework.webdriver.impl.keywordDriven.dataNonIterative.KeywordNonIterativeDriverScript;
import com.autopia4j.framework.webdriver.impl.keywordDriven.dataNonIterative.KeywordNonIterativeTestScript;


/**
 * Test for login with valid user credentials
 */
public class TestForValidLogin extends KeywordNonIterativeTestScript {
	
	@Test
	public void testRunner() {
		WebDriverTestParameters testParameters =
				new WebDriverTestParameters(currentModule, currentTest);
		testParameters.setCurrentTestDescription("Test for login with valid user credentials");
		
		KeywordNonIterativeDriverScript driverScript = new KeywordNonIterativeDriverScript(testParameters);
		driverScript.driveTestExecution();
		assertTestPassed(driverScript);
	}
}