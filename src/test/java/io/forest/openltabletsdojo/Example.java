package io.forest.openltabletsdojo;

import java.net.URISyntaxException;

import org.openl.rules.runtime.RulesEngineFactory;

public class Example {
	public static void main(String[] args) throws URISyntaxException {
		
		String path = Example.class.getResource("/openl/rules/TemplateRules.xlsx").getFile();
		
		System.out.println("Path: " + path);
////define the interface
		RulesEngineFactory<Simple> rulesFactory = new RulesEngineFactory<Simple>(path, Simple.class);
		
		Simple rules = (Simple) rulesFactory.newInstance();
		String result = rules.hello(9);
		
		System.out.println("Result> " + result);
		
	}
}