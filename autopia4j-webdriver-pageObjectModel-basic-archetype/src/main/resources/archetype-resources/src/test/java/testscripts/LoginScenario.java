#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import com.autopia4j.framework.webdriver.impl.modular.basic.ModularBasicTestScript;


/**
 * Login scenario test cases
 */
public class LoginScenario extends ModularBasicTestScript {
	
	// Put your test methods here:
	// 	Use native TestNG annotations such as @Test, @BeforeMethod and @AfterMethod
	//	Build data objects and pass them to your page objects and flows as required
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