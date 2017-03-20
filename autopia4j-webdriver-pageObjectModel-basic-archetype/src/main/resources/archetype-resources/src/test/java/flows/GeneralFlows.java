#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.flows;

import com.autopia4j.framework.webdriver.core.ReusableLibrary;
import com.autopia4j.framework.webdriver.core.ScriptHelper;


/**
 * Class for storing general purpose test flows
 */
public class GeneralFlows extends ReusableLibrary {
	
	public GeneralFlows(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}
	
	// Put your flow methods here:
	// 	Must be public methods returning a page object representing the exit point of the method,
	//  or a Boolean variable that can be used to validate a specific condition on the current page.
	//	These methods can take data objects as inputs if required.
}