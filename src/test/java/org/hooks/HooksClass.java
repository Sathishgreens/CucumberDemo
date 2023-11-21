package org.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksClass {
	
	@Before
	public void bef() {
		System.out.println("@Before");
	}
	
	@After
	public void aft() {
		System.out.println("@After");
	}
	
	@BeforeStep("@Regression")
	public void befStep() {
		System.out.println("@BeforeStep");
	}
	
	@AfterStep("@Regression")
	public void aftStep() {
		System.out.println("@AfterStep");
	}
	
	
}
