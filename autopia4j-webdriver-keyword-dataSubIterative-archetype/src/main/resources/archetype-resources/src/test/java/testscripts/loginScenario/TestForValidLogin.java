#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts.loginScenario;

import org.testng.annotations.Test;

import com.autopia4j.framework.webdriver.core.WebDriverTestParameters;
import com.autopia4j.framework.webdriver.impl.keywordDriven.dataSubIterative.KeywordSubIterativeTestScript;
import com.autopia4j.framework.webdriver.impl.keywordDriven.dataSubIterative.KeywordSubIterativeDriverScript;


/**
 * Test for login with valid user credentials
 */
public class TestForValidLogin extends KeywordSubIterativeTestScript {
	
	@Test
	public void testRunner() {
		WebDriverTestParameters testParameters =
									new WebDriverTestParameters(currentModule, currentTest);
		testParameters.setCurrentTestDescription("Test for login with valid user credentials");
		
		KeywordSubIterativeDriverScript driverScript = new KeywordSubIterativeDriverScript(testParameters);
		driverScript.driveTestExecution();
		assertTestPassed(driverScript);
	}
}