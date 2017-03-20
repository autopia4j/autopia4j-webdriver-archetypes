#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import com.autopia4j.framework.webdriver.core.ScriptHelper;


/**
 * LoginPage class
 */
public class LoginPage extends MasterPage {	
	// Put your UI Map object definitions here (should be Selenium "By" fields)
	
	
	public LoginPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}
	
	// Put your page methods here:
	// 	Must be public methods returning a page object representing the exit point of the method,
	//  or a Boolean variable that can be used to validate a specific condition on the current page.
	//	These methods can take data objects as inputs if required.
}