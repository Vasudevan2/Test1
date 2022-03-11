package org.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void Before() {
System.out.println("===starts===");
	}
@After
public void After() {
System.out.println("===ends===");
}
}
