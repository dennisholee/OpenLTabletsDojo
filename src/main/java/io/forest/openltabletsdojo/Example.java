package io.forest.openltabletsdojo;

import java.net.URISyntaxException;

import org.openl.rules.runtime.RulesEngineFactory;
import org.slf4j.Logger;

public class Example {
	
	public static void main(String[] args) throws URISyntaxException {

		String path = Example.class.getResource("/openl/rules/TemplateRules.xlsx").getFile();

		// define the interface
		RulesEngineFactory<Claims> rulesFactory = new RulesEngineFactory<Claims>(path, Claims.class);

		Claims rules = (Claims) rulesFactory.newInstance();
		Boolean result = rules.isClaims(false, false);

		System.out.println("Claims> " + result);

	}
}