#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts.loginScenario;

import org.testng.annotations.Test;

import com.autopia4j.framework.assertions.BlockingAssertion;
import com.autopia4j.framework.webdriver.core.WebDriverTestParameters;
import com.autopia4j.framework.webdriver.impl.modular.dataIterative.ModularIterativeDriverScript;
import com.autopia4j.framework.webdriver.impl.modular.dataIterative.ModularIterativeTestScript;


/**
 * Test for login with valid user credentials
 */
public class TestForValidLogin extends ModularIterativeTestScript {
	
	@Test()
	public void testRunner() {
		WebDriverTestParameters testParameters =
									new WebDriverTestParameters(currentModule, currentTest);
		testParameters.setCurrentTestDescription("Test for login with valid user credentials");
		// Specify other test parameters as appropriate here
		
		ModularIterativeDriverScript driverScript = new ModularIterativeDriverScript(testParameters);
		driverScript.driveTestExecution();
		assertTestPassed(driverScript);
	}
	
	@Override
	public void setUp() {
		// Put your test setup code here - leverage your page objects and flows
		// Leave this function blank if not applicable
		// Note that the "scriptHelper" object is auto-initialized by the framework
	}
	
	@Override
	public void executeTest() {
		// Leverage the autopia4j "BlockingAssertion" - Avoid native TestNG assertions
		BlockingAssertion strongly = new BlockingAssertion(report);
		
		// Put your test code here - leverage your page objects and flows
		// Note that the "scriptHelper" object is auto-initialized by the framework
	}
	
	@Override
	public void tearDown() {
		// Put your test teardown code here (optional) - leverage your page objects and flows
		// Leave this function blank if not applicable
		// Note that the "scriptHelper" object is auto-initialized by the framework
	}
}