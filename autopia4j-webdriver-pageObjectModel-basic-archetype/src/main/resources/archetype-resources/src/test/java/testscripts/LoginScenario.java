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
	//	Leverage the autopia4j "TestNgWrappedAssertion" - Avoid native TestNG assertions
	
	// Avoid class level fields -> they get shared across test methods that run in parallel
	// If you must use them, make sure they are implemented as ThreadLocal variables
}