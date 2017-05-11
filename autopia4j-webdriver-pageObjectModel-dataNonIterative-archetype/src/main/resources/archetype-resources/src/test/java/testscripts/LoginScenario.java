#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import org.testng.annotations.Test;

import com.autopia4j.framework.assertions.TestNgWrappedAssertion;
import com.autopia4j.framework.webdriver.core.ScriptHelper;
import com.autopia4j.framework.webdriver.impl.modular.dataNonIterative.ModularNonIterativeTestScript;


/**
 * Login scenario test cases
 */
public class LoginScenario extends ModularNonIterativeTestScript {
	
	// Put your test methods here:
	// 	Use native TestNG annotations such as @Test, @BeforeMethod and @AfterMethod
	//  You can include any number of test methods as required
	
	// Avoid class level fields -> they get shared across test methods that run in parallel
	// If you must use them, make sure they are implemented as ThreadLocal variables
	
	@Test
	public void testForValidLogin() {
		// Get the "scriptHelper" object to begin with
		ScriptHelper scriptHelper = currentScriptHelper.get();
		
		//	Leverage the autopia4j "TestNgWrappedAssertion" - Avoid native TestNG assertions
		TestNgWrappedAssertion strongly = new TestNgWrappedAssertion(scriptHelper.getReport());
		
		// Put your test code here - leverage your page objects and flows
	}
}